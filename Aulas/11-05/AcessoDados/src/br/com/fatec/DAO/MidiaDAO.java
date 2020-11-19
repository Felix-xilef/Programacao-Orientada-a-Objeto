/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.bean.Midia;
import br.com.fatec.persistencia.Banco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class MidiaDAO implements DAO<Midia> {
    //Permite o uso de comandos DML (select, insert, delete e update) para aceesar nosso SGBD
    private java.sql.PreparedStatement pst;
    
    //Permite armazenar um conjunto de dados vindo do SGBD para ser manipulado
    private java.sql.ResultSet rs;
    
    //Representar os dados do meu negócio
    private Midia midia;

    @Override
    public boolean insere(Midia obj) throws SQLException {
        String sql = "insert into Midia values(?, ?, ?, ?)";
        Banco.conectar();
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setInt(1, obj.getCodMidia());
        pst.setString(2, obj.getTitulo());
        pst.setFloat(3, obj.getValor());
        pst.setInt(4, obj.getCodGenero());
        int res = pst.executeUpdate();
        Banco.desconectar();
        return res != 0;
    }

    @Override
    public boolean remove(Midia obj) throws SQLException {
        String sql = "delete from Midia where codMidia = ?";
        Banco.conectar();
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setInt(1, obj.getCodMidia());
        int res = pst.executeUpdate();
        Banco.desconectar();
        return res != 0;
    }

    @Override
    public boolean altera(Midia obj) throws SQLException {
        String sql = "update Midia set titulo = ?, valor = ?, codGenero = ? where codMidia = ?";
        Banco.conectar();
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setInt(4, obj.getCodMidia());
        pst.setString(1, obj.getTitulo());
        pst.setFloat(2, obj.getValor());
        pst.setInt(3, obj.getCodGenero());
        int res = pst.executeUpdate();
        Banco.desconectar();
        return res != 0;
    }

    @Override
    public Midia buscaID(Midia obj) throws SQLException {
        String sql = "select * from Midia where codMidia = ?";
        Banco.conectar();
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setInt(1, obj.getCodMidia());
        rs = pst.executeQuery();
        if (rs.next()) {
            midia = new Midia(rs.getInt("codMidia"), rs.getInt("codGenero"), rs.getString("titulo"), rs.getFloat("valor"));
        } else {
            midia = null;
        }
        Banco.desconectar();
        return midia;
    }

    @Override
    public Collection<Midia> lista(String criterio) throws SQLException {
        Collection<Midia> retorno = new ArrayList<>();
        String sql = "select * from Midia";
        if (criterio.length() > 0) {
            sql += "where" + criterio;
        }
        Banco.conectar();
        pst = Banco.obterConexao().prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            midia = new Midia(rs.getInt("codMidia"), rs.getInt("codGenero"), rs.getString("titulo"), rs.getFloat("valor"));
            retorno.add(midia);
        }
        Banco.desconectar();
        return retorno;
    }
}
