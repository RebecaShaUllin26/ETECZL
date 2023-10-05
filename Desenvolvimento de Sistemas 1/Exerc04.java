/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerc04;
import java.util.Scanner;

/**
 *
 * @author casa
 */
public class Exerc04 {
    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        
        int cont = 0;
        System.out.println("digite os numeros por favor: . E para parar, digite o numero:0");
        System.out.println("digite os numeros por favor: ");
        
        while(true){
            
            int numero = sc.nextInt();
            if (numero >= 100 && numero <= 200){
                cont = cont + 1;
            }
            if (numero == 0){
                System.out.println("os numeros que foram digitados entre 100 e 200 é: " +cont);
            }
        }
    }
}
