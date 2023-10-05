/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelaexemp;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author dti
 */
public class ExempBotao extends JFrame{
    JButton botao;
   public ExempBotao(){
       super("Exemplo com Jbutton");
      Container tela=getContentPane();
      setLayout(null);
      botao =new JButton("Procurar");
      botao.setBounds(50,20,100,20);
      tela.add(botao);
      setSize(400,250);
      setVisible(true);
   }
   public static void main(String [] args){
       ExempBotao app= new ExempBotao();
       app.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
