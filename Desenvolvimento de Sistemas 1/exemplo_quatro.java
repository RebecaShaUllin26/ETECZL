/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semretorno;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class exemplo_quatro {
     public static void main(String[] args)
     {
         int num;
         num=Integer.parseInt(JOptionPane.showInputDialog("entre com um numero:: "));
         
         if (RestoPorDois(num)== 0 )
             JOptionPane.showMessageDialog(null,"o numero é par.);
     }
}
