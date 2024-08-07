/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Lucas
 */
public class ProdutoDTO {
    private String codigo_produto;
    private String nome_produto;
    private String quantidade_produto;
    
    public ProdutoDTO(String codigo_produto, String nome_produto, String quantidade_produto){
        this.nome_produto = nome_produto;
        this.codigo_produto = codigo_produto;
        this.quantidade_produto = quantidade_produto;
    
    }
    public ProdutoDTO(){
        
    }
    

    /**
     * @return the codigo_produto
     */
    public String getCodigo_produto() {
        return codigo_produto;
    }

    /**
     * @param codigo_produto the codigo_produto to set
     */
    public void setCodigo_produto(String codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    /**
     * @return the nome_produto
     */
    public String getNome_produto() {
        return nome_produto;
    }

    /**
     * @param nome_produto the nome_produto to set
     */
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    /**
     * @return the quantidade_produto
     */
    public String getQuantidade_produto() {
        return quantidade_produto;
    }

    /**
     * @param quantidade_produto the quantidade_produto to set
     */
    public void setQuantidade_produto(String quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }
    
    

}