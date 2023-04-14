
package br.com.equivalencia.dao;

import java.sql.*;

public class ModuloConexao {
   
    //Método que cria e mantêm a conexão com o banco de dados.
    public static Connection conector(){
        
        //Chamando o Driver de conexão com o banco.       
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3308/equivalencia";
        String user = "root";
        String password = "";
        
        //Estabelecendo a conexão com o Database.
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            return null;
        }       
    }    
}
