/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.ProdutoDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Lucas
 */
public class ProdutoDAO {
    
    public void cadastrarProdutos(ProdutoDTO obj) throws Exception{
        String sql = "INSERT INTO produtos(codigo, quantidade, nome_produto )VALUES(?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = ConexaoDAO.getConnection();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, obj.getCodigo_produto());
            pstm.setString(2, obj.getQuantidade_produto()) ;
            pstm.setString(3, obj.getNome_produto());
            pstm.execute();
        } catch(SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro ao salvar dados "+ e.toString());
        }
        finally {
            try {
                if(pstm!=null) {
                    JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!!!");
                    pstm.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            }
            catch (Exception e) {
                System.out.println("Erro ao salvar dados "+ e.getMessage().toLowerCase());           
            }
        }   
    
    }
    public ArrayList<ProdutoDTO> PesquisarProduto() throws SQLException, ClassNotFoundException {
        
        Connection conn;
        conn = new ConexaoDAO().getConnection();
        PreparedStatement pstm;
        ResultSet rs;
        ArrayList<ProdutoDTO> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM produtos";
        
        try {
            pstm = conn.prepareCall(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                ProdutoDTO objprodutoDTO = new ProdutoDTO();    
                
                objprodutoDTO.setCodigo_produto(rs.getString("codigo"));
                objprodutoDTO.setNome_produto(rs.getString("nome_produto"));
                objprodutoDTO.setQuantidade_produto(rs.getString("quantidade"));
                
                lista.add(objprodutoDTO);
                
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Pesquisar   : " + erro);
        }
        return lista;
 
   }

    
}