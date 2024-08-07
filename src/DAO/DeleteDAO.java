/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DTO.DeleteDTO;

/**
 *
 * @author Lucas
 */
public class DeleteDAO {

    public static boolean excluir(String codigo) throws SQLException, ClassNotFoundException {
    Connection connection = null;
    PreparedStatement stmt = null;

    try {
        connection = ConexaoDAO.getConnection();
        String sql = "DELETE FROM produtos WHERE codigo = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, codigo);

        int rowsAffected = stmt.executeUpdate();

        return rowsAffected > 0; // Retorna true se houve linhas afetadas (exclusão bem-sucedida)

    } finally {
        // Feche a declaração e a conexão, mesmo em caso de exceção
        if (stmt != null) {
            stmt.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}
}