/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lernota;

import javax.swing.JOptionPane;//pacote do nucleo de java

/**
 *
 * @author dti
 */ //Orientando a classe lerNota
public class LerNota { //Inicio da classe lerNota
    // Extensao do pacote do nucleo do java
    public static void main(String[] args){ //Inicio da classe main
        lerNota();
    }//Fim da classe da main
    static void lerNota(){
        double n1,n2;
        String nome;
        nome=JOptionPane.showInputDialog(null,"Digite um Nome:");
        //Declaracao das variaveis e atribuicao dos valores
          n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota"));
          n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota"));
          JOptionPane.showMessageDialog(null,nome);
          calculaMedia(n1,n2);
    }

    private static void calculaMedia(double a1, double a2) {
        double md;
        //Calculo do programa e seu resultado
        md=(a1+a2)/2;
       if (md>=7)
           JOptionPane.showMessageDialog(null,"Aprovado"+ md);
       else
           if (md<7 && md>3)
               JOptionPane.showMessageDialog(null,"Recuperacao"+ md);
       else
           if (md<3)
               JOptionPane.showMessageDialog(null,"reprovado"+ md);
    }
} //Fim da classe lerNota
