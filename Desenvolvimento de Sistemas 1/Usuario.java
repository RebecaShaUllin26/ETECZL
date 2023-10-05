/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;

/**
 *
 * @author dti
 */
public class Usuario {
       // Atributos
    String nome;
    String email;
    String login;
    String senha;
    
    // Construtores
    // Inicialiazar os atributos vazios
    public Usuario() {
        this("", "", "", "");
    }
    // Inicializar os atributos com valores passados por parametro
    public Usuario(String email, String login, String nome, String senha){
        this.email = email;
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }
    // Getters e Setters
    public String getNome(){
        return nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    // Implementacao dos demais getters e seterrs
    
    // Metodos especificos da classe
    public void provarExistencia(){
        System.out.println("Oi, eu existo!");
}
}