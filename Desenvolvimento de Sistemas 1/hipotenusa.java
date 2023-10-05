/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc004;

import javax.swing.JOptionPane;//pacote do nucleo JOptionPane

/**
 *
 * @author Admin
 */
public class hipotenusa {//inicio da classe hipotenusa
    public static void main(String[] args){//inicio da classe main
        hipotenusa();
    }//fim da classe main
    static void hipotenusa() {
        //declaraco de variaveis e atribuindo valores
        double alt, base, result;
        alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
                base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
                //resultado do calculo
                result = Math.sqrt(Math.pow(alt, 2) + Math.pow(base, 2));
        JOptionPane.showMessageDialog(null," A hipotenusa é:" + result) ;      

    }
}//fim da classe hipotenusa


