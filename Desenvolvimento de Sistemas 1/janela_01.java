/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc02;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;//pacote do nucleo JOptionPane

/**
 *
 * @author dti
 */
public class janela_01 extends JFrame  {//inicio da classe janela
    public janela_01(){//chamando o metodo janela
        super("Janela 01");
        Container tela =getContentPane();
        tela.setBackground(new Color(125,125,125));
        ImageIcon icone = new ImageIcon ("test.bloom.jpg");
        setIconImage(icone.getImage());
        setSize(400,200);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }
    public static void main(String args[]){//inicio da classe main
        //resultado do calculo
        janela_01 app= new janela_01();
         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//fim da classe main
}//fim da classe janela
