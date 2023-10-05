/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc04;

import javax.swing.JOptionPane;//pacote do nucleo JPtionPane

/**
 *
 * @author dti
 */
public class Carro {//inicio da classe Carro
     private String marca,modelo,cor,placa;

    public Carro() {
        this("","","","");
    }
    //declaracao de variaveis
    public Carro(String _marca, String _modelo, String _cor, String _placa){
        this.marca = _marca;
        this.modelo = _modelo;
        this.cor = _cor;
        this.placa = _placa;
    }
    //metodo da exibicao do que o carro faz
    public void ligar(){
        JOptionPane.showMessageDialog(null, "o carro ligou");
    }
    
    public void desligar(){
        JOptionPane.showMessageDialog(null, "o carro desligou");
    }
    
    public void acelerar(){
        JOptionPane.showMessageDialog(null, "o carro acelerou");
    }
    
    public void frear(){
        JOptionPane.showMessageDialog(null, "o carro freou");
    }
}//fim da classe carro

