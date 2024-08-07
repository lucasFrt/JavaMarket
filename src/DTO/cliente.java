/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

public class cliente {
    //private Integer id;
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    //MÉTODO CONSTRUTOR CHEIO
    public cliente(String nome, String email, String usuario, String senha) {
    //public Cliente(Integer id, String nome, String idade, String rg) {    
        //this.id=id;
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
       // this.rg = rg;
    }
    //MÉTODO CONSTRUTOR VAZIO
    public cliente() {
    }
    //MÉTODOS GETTERS E SETTERS
    /*public Integer getId() {
        return id;
    }
    public void setId(Integer nome) {
        this.id = id;
    }*/
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
