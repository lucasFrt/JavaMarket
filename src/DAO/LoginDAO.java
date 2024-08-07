/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.LoginDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class LoginDAO {
    
    Connection conn;
    
    public ResultSet autenticarLogin(LoginDTO objlogindto) throws SQLException, ClassNotFoundException{
        conn = ConexaoDAO.getConnection();
        
        try {
            String sql = "select * from cadastro where usuario = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objlogindto.getNome_usuario());
            pstm.setString(2, objlogindto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LoginDAO: " + erro);
            return null;
            
        }
    }
    
}
