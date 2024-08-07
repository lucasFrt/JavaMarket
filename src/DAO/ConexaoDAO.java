/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/javamarket";
    private static final String USER = "root";
    private static final String PASS = "";
    public static Connection getConnection()throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(URL, USER, PASS);
        return conexao;
    }
    public static void classConnection(Connection conn) throws Exception{
        try {
            Connection conexao = ConexaoDAO.getConnection();
            System.out.println("Conexão obtida com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a conexao com o banco de dados: "+ e);
        }
    }
   
}
