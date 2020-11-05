/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Banco {
    //Cria atributos
    public static String bancoDados, usuario, senha, servidor;
    public static int porta;
    
    //Variável de conexão
    public static java.sql.Connection conexao = null;
    
    //Define valores
    static {
        //MySql
        bancoDados = "locadora";
        usuario = "root";
        senha = "";
        servidor = "localhost";
        porta = 3306;
        
        /*
        //SqlServer
        bancoDados = "locadora";
        usuario = "sa";
        senha = "123456";
        servidor = "localhost";
        porta = 1433;
        */
    }
    
    //Métodos
    public static void conectar() throws SQLException{
        //MySql
        String url = "jdbc:mysql://" + servidor + ":" + porta + "/" + bancoDados;
        
        /*
        //SqlServer
        String url = "jbc:sqlserver://" + servidor + ":" + porta + ";databaseName=" + bancoDados;
        */
        
        conexao = DriverManager.getConnection(url, usuario, senha);
    }
    
    public static void desconectar() throws SQLException{
        conexao.close();
    }
    
    public static java.sql.Connection obterConexao() throws SQLException{
        if (conexao == null) {
            throw new SQLException("Conexão esta fechada...");
        } else {
            return conexao;
        }
    }
}
