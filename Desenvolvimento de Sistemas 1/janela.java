/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc01;

import javax.swing.JFrame;//pacote do nucleo JOptionPane

/**
 *
 * @author dti
 */
public class janela extends JFrame {//inicio da classe janela
    public janela(){//chamando o metodo janela
        super("Programacao Orientada a Objeto");
        setLocationRelativeTo(null);
        setSize(450,250);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String args[]){//inicio da classe main
         //resultado do calculo
        janela app= new janela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//fim da classe main
}//fim da classe janela
