/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.bean.Genero;
import br.com.fatec.persistencia.Banco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class GeneroDAO implements DAO<Genero>{
    //Permite o uso de comandos DML (select, insert, delete e update) para aceesar nosso SGBD
    private java.sql.PreparedStatement pst;
    
    //Permite armazenar um conjunto de dados vindo do SGBD para ser manipulado
    private java.sql.ResultSet rs;
    
    //Representar os dados do meu negócio
    private Genero genero;
    
    @Override
    public boolean insere(Genero obj) throws SQLException {
        String sql = "insert into Genero (codGenero, descricao) values (?, ?)"; //'?' indica um parametro
        
        //Abre a conexão com o banco
        Banco.conectar();
        
        //Prepara o comando pst
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //Associa os dados do objeto Genero com o comando insert
        pst.setInt(1, obj.getCodGenero());
        pst.setString(2, obj.getDescricao());
        
        //Executa o comando
        int res = pst.executeUpdate();
        
        //Fecha o banco
        Banco.desconectar();
        return res != 0;
    }

    @Override
    public boolean remove(Genero obj) throws SQLException {
        String sql = "delete from Genero where codGenero = ?"; //'?' indica um parametro
        
        //Abre a conexão com o banco
        Banco.conectar();
        
        //Prepara o comando pst
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //Associa os dados do objeto Genero com o comando delete
        pst.setInt(1, obj.getCodGenero());
        
        //Executa o comando
        int res = pst.executeUpdate();
        
        //Fecha o banco
        Banco.desconectar();
        return res != 0;
    }

    @Override
    public boolean altera(Genero obj) throws SQLException {
        String sql = "update Genero set descricao = ? where codGenero = ?"; //'?' indica um parametro
        
        //Abre a conexão com o banco
        Banco.conectar();
        
        //Prepara o comando pst
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //Associa os dados do objeto Genero com o comando update
        pst.setString(1, obj.getDescricao());
        pst.setInt(2, obj.getCodGenero());
        
        //Executa o comando
        int res = pst.executeUpdate();
        
        //Fecha o banco
        Banco.desconectar();
        return res != 0;
    }

    @Override
    public Genero buscaID(Genero obj) throws SQLException {
        String sql = "select * from Genero where codGenero = ?"; //'?' indica um parametro
        
        //Abre a conexão com o banco
        Banco.conectar();
        
        //Prepara o comando pst
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //Associa os dados do objeto Genero com o comando SELECT
        pst.setInt(1, obj.getCodGenero());

        //Executa o comando
        rs = pst.executeQuery();

        //Verificar se trouxe algum registro
        //rs.next() faz a leitura do próximo registro, se existir devolve true se nao devolve false
        if (rs.next()) {
            //Instancia o objeto para retorno dos dados
            genero = new Genero();

            //Jogar os dados do banco para o objeto
            genero.setCodGenero(rs.getInt("codGenero"));
            genero.setDescricao(rs.getString("descricao"));
        } else {
            //Não encontrou nada!!!
            genero = null;
        }

        //Fecha o banco
        Banco.desconectar();

        //Devolve o objeto com os dados do banco ou não
        return genero;
    }

    @Override
    public Collection<Genero> lista(String criterio) throws SQLException {
        //Cria a coleção para os dados
        Collection<Genero> retorno = new ArrayList<>();
        
        String sql = "select * from Genero";
        
        //Verifica se tem filtro a fazer
        if (criterio.length() > 0) {
            sql += "WHERE " + criterio;
        }

        //Abre a conexao como banco
        Banco.conectar();

        //Prepara o comando pst
        pst = Banco.obterConexao().prepareStatement(sql);

        //Executa o comando
        rs = pst.executeQuery();

        //Verificar se trouxe algum registro
        //rs.next() faz a leitura do próximo registro, se existir devolve true se nao devolve false
        //Enquanto existir registros na tabela, vai lendo até o fim
        while (rs.next()) {
            //Instancia o objeto para retorno dos dados
            genero = new Genero();

            //Jogar os dados do banco para o objeto
            genero.setCodGenero(rs.getInt("codGenero"));
            genero.setDescricao(rs.getString("descricao"));

            //Adiciona o registro dentro da Coleção
            retorno.add(genero);
        }

        //Fecha o banco
        Banco.desconectar();

        //Devolve a lista com todos os registros
        return retorno;
    }
}
