/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exempmediaaluno;
import javax.swing.JOptionPane; // Faz parte do pacote JOptionPane para a utilizacao da interface com o usuario
/**
 *
 * @author casa
 */
public class ExempMediaAluno { // Orientando a classe media

    public static void main(String[] args) // Extensao do pacote do nucleo de java
        {
    //
    double n1 = 0, n2 = 0, n3 = 0, n4 = 0, md = 0;
        String des = "";
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1 nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2 nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3 nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4 nota"));
        // Declarando as variaveis e atribuindo os valores
        md = md = (n1 + n2 + n3 + n4) / 4;
        // Calculo do programa
        if(md >= 6)
        {
          des = "Aprovado"; 
        }
        else if ( md < 3 )
        {
            des = "Retido";
        }
        else
        {
            des = "Exame";
        }
        //Metodos estaticos que criam caixas de dialogos objetivas
        JOptionPane.showMessageDialog(null, "A media é: " + md + "\nSituacao do aluno: " + des);
        }// Apresentando o resultado da execusao do programa. A letra "n" serve para pular uma linha ao dar o resultado
        
    }
        
        
            
            
    
    
