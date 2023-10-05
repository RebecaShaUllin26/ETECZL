/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc002;
import javax.swing.*;//pacote JOptionPane
/**
 *
 * @author dti
 */
public class Diferenca {//inicio da classe diferenca
     public static double n1,n2;   
    
    public static void main(String [] args)//inicio da classe main
    { //declaracao das variavies e atribuindo resultados
        JOptionPane.showMessageDialog(null,"Bem Vindo a Calculadora de Diferença, do Maior para o menor");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("insira o primeiro o valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("insira o segundo o valor"));
        diferenca(n1,n2);

         
    }//fim da classe main
    static void diferenca (double a ,double b){
        //metodo diferenca
        //estrutura de decisao if
        if (n1 > n2){
         double resul = a - b;
         JOptionPane.showMessageDialog(null, "a diferenca desses valores é de: " + resul);

        }
        else{
            if (n2 > n1){
                 double resul = b - a;
                 JOptionPane.showMessageDialog(null, "a diferenca desses valores é de: " + resul);

            }
            else{
                 JOptionPane.showMessageDialog(null, "os valores sao iguais");
            
            }
        
        }
            
    }
}//fim da classe diferenca
