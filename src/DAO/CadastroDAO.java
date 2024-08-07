/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet ;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public  class  CadastroDAO {
    
    
    public void adicionar(cliente obj ) throws Exception{
        String  sql = "INSERT INTO cadastro(Nome_usuario, email, usuario, senha )VALUES(?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = ConexaoDAO.getConnection();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, obj.getNome());
            pstm.setString(2, obj.getEmail()) ;
            pstm.setString(3, obj.getUsuario());
            pstm.setString(4, obj.getSenha());
            pstm.execute();
        }catch(SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro ao salvar dados "+ e.toString());
            //System.out.println("Erro ao salvar dados "+ e.getMessage().toLowerCase());
        }finally {
            try {
                if(pstm!=null) {
                    JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!!!");
                    pstm.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            }catch (Exception e) {
                System.out.println("Erro ao salvar dados "+ e.getMessage().toLowerCase());           
            }
        }
    }
}