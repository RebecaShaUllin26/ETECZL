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
public class exemplo_tres {//inicio da classe
    public static void main (String[] args)
    {//inicio da classe main
        //declarando as variaveis e atribuindo valores
        int idade1, idade2;
        String nome1, nome2;
        
        //apresentando as caixas de dialogos
        nome1=JOptionPane.showInputDialog("Digite o nome da 1 pessoa ::");
        idade1=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1 pessoa:"));
        
        nome2=JOptionPane.showInputDialog("Digite o nome da 2 pessoa ::");
        idade2=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2 pessoa:"));
        
        String texto = PessoaMaisVelha(nome1, idade1, nome2,idade2);
        JOptionPane.showMessageDialog(null, texto);
    }//fim da classe main
    //criacao do metodo pessoaMaisVelha
    static String PessoaMaisVelha(String n1, int id1, String n2, int id2)
    {
        //estrutura de condicao
        if (id1 > id2)
            return n1 + "é a pessoa mais velha";
        else
            if (id2 > id1)
            return n2 + "é a pessoa mais velha";
        else
                return n1 + " e " + n2 + "tem a mesma idade";
    }
}//fim da classe
