/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplodecod;

/**
 *
 * @author dti
 */
// Orientando a classe
// Inicio da classe
public class Lampada {
    // Extensao do pacote do nucleo do java que é privado
    private String estadoDaLampada = "apagada";
    
    // Criacao dos metodos da classe
    public void acende() {
        // Declarando as variaveis
        estadoDaLampada = "acesa";
    }
    public void apaga() {
        estadoDaLampada = "apagada";
    }
    public void mostraEstado (){
        if (estadoDaLampada.equals("acesa")){
            // Apresentando o resultado da execusao do programa
            System.out.println("Esta acesa!");
        }else{
            System.out.println("Esta apagada!");
        }
    }
} // Fim da classe lampada
