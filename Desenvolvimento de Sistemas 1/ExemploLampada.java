/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplodecod;

/**
 *
 * @author dti
 */ 
//Orientando a classe
public class ExemploLampada {
    /**
 *
 * @param args the command line arguments
 */
    // Inicio do metodo main
    public static void main(String[] args ){
        
        // Estanciando a classe lampada
        Lampada lampada = new Lampada();
        
        // Chamada dos metodos 
        lampada.acende();
        lampada.apaga();
        lampada.mostraEstado();
    } // Fim do metodo main
}// Fim da classe
