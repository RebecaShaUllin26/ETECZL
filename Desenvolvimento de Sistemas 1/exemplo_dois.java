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
public class exemplo_dois {//inicio da classe
    public static void main(String[] args)
    {//inicio da classe main
        
        digite();
    }//fim da classe main
    static void digite()//criacao do metodo digite
    {
        //declarando as variaveis e atribuindo resultados
       int t;
        String p;
        //apresentando as caixas de dialogos
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
        t = tamanho(p);
        JOptionPane.showMessageDialog(null,p+ "possui"+t+"caracteres");
    }
    static int tamanho(String x)
    {
        return x.length();
    }
}//fim da classe
