/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instancia;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dti
 */
public class TesteInstancia {// Inicio da classe
    public static void main(String [] args){// Inicio da classe main
        Scanner entrada = new Scanner (System.in);// Instancia o objeto
        byte n = 0; //contador de notas
        //Atribuindo valores e declarando as variaveis
        double nota, soma = 0;
        double media;
        System.out.print("Nota do aluno, -1 termina: ");
        nota = entrada.nextInt();
        while (nota != -1){
            soma = soma + nota;
            n = (byte) (n + 1);
            System.out.print("Nota do aluno, -1 termina: ");
            nota = entrada.nextInt();
        }
        DecimalFormat df = new DecimalFormat("0.00");// Instancia o objeto
        if (n != 0) {
            media = soma / n;
            System.out.println("Media igual a "+ df.format(media));
        }
        else
            System.out.println("Nenhuma nota foi digitada");
    }// Fim da classe main
}// Fim da classe TesteInstancia
