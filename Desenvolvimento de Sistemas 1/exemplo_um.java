/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semretorno;

import javax.swing.JOptionPane;//pacote do nucleo do java

/**
 *
 * @author Admin
 */
public class exemplo_um { //inicio da classe
    public static void main(String[] args)
    { //inicio da classe main
        
        digite();
    }//fim da classe main
    static void digite()//criacao do metodo digite
    {
        //declarando as variaveis e atribuindo resultados
       int a;
       //apresentando as caixas de dialogos
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        dobro(a);
    }
    static void dobro(int n)
    {
        int d = n * 2;
        JOptionPane.showMessageDialog(null,"Dobro de "+n+"é "+ d );
    }
}//fim da classe
