/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_3;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Banco {
    public static String usuario, senha, servidor, bancoDados;
    public static int porta;
    public static java.sql.Connection conexao = null;
    
    static {
        usuario = "root";
        senha = "";
        servidor = "localhost";
        bancoDados = "Prova";
        porta = 3306;
    }
    
    public static void conectar() throws SQLException{
        String url = "jdbc:mysql://" + servidor + ":" + porta + "/" + bancoDados;
        conexao = DriverManager.getConnection(url, usuario, senha);
    }
    
    public static void desconectar() throws SQLException{
        conexao.close();
    }
    
    public static java.sql.Connection obterConexao() throws SQLException{
        if (conexao == null) {
            throw new SQLException("A conxão não está aberta...");
        } else {
            return conexao;
        }
    }
}
