/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal {
     public static void main(String [] args ){
       Usuario usuario1 = new Usuario ();
       usuario1.provarExistencia ();
     
       String nome = JOptionPane.showInputDialog("informe o seu nome: ");
      
      JOptionPane.showMessageDialog(null, " o nome digitado foi: " + nome);
      
      String email = JOptionPane.showInputDialog("informe o seu email: ");
      
   JOptionPane.showMessageDialog(null, "o email digitado foi: "+ email);
   
    String login = JOptionPane.showInputDialog("informe o seu login: ");
    
    JOptionPane.showMessageDialog(null, "o login digitado foi: "+ login);
    
    String senha = JOptionPane.showInputDialog("informe sua senha: ");
    
    JOptionPane.showMessageDialog(null, "a senha digitada foi: "+ senha);
     }
}
