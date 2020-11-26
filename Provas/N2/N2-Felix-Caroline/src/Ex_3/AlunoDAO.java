/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_3;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class AlunoDAO implements DAO<Aluno>{
    private java.sql.PreparedStatement pst;
    private java.sql.ResultSet rs;
    private Aluno aluno;
    
    @Override
    public boolean insere(Aluno dado) throws SQLException {
        String sql = "insert into Aluno (codAluno, nome, turma) values (?, ?, ?)";
        
        Banco.conectar();
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setInt(1, dado.getCodAluno());
        pst.setString(2, dado.getNome());
        pst.setString(3, dado.getTurma());
        
        int resp = pst.executeUpdate();
        
        Banco.desconectar();
        return resp != 0;
    }

    @Override
    public boolean remover(Aluno dado) throws SQLException {
        String sql = "delete from Aluno where codAluno = ?";
        
        Banco.conectar();
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setInt(1, dado.getCodAluno());
        
        int resp = pst.executeUpdate();
        
        Banco.desconectar();
        return resp != 0;
    }

    @Override
    public boolean alterar(Aluno dado) throws SQLException {
        String sql = "update Aluno set nome = ?, turma = ? where codAluno = ?";
        
        Banco.conectar();
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setInt(3, dado.getCodAluno());
        pst.setString(1, dado.getNome());
        pst.setString(2, dado.getTurma());
        
        int resp = pst.executeUpdate();
        
        Banco.desconectar();
        return resp != 0;
    }

    @Override
    public Aluno buscarID(Aluno dado) throws SQLException {
        String sql = "select * from Aluno where codAluno = ?";
        
        Banco.conectar();
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setInt(1, dado.getCodAluno());

        rs = pst.executeQuery();

        if (rs.next()) {
            aluno = new Aluno(rs.getInt("codAluno"), rs.getString("nome"), rs.getString("turma"));
        } else {
            aluno = null;
        }

        Banco.desconectar();

        return aluno;
    }

    @Override
    public Collection<Aluno> listar(String criterio) throws SQLException {
        Collection<Aluno> listaAluno = new ArrayList<>();
        
        String sql = "select * from Aluno";
        
        if (criterio.length() > 0) {
            sql += "where " + criterio;
        }

        Banco.conectar();
        pst = Banco.obterConexao().prepareStatement(sql);
        
        rs = pst.executeQuery();

        while (rs.next()) {
            aluno = new Aluno(rs.getInt("codAluno"), rs.getString("nome"), rs.getString("turma"));
            listaAluno.add(aluno);
        }

        Banco.desconectar();

        return listaAluno;
    }
}
