/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc03;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;//pacote do nucleo JOptionPane
import javax.swing.JLabel;

/**
 *
 * @author dti
 */
public class janela_03  extends JFrame {//inicio da classe janela
    JLabel Nome,Endereco,Telefone,Cidade,Estado,CEP,Titulo;//declarando as variaveis JLabel
    public janela_03(){//chamando o metodo janela
        super("Jlabel");
         Container tela =getContentPane();
         tela.setBackground(Color.cyan);
         setLayout(null);
         ImageIcon icone = new ImageIcon("test.bloom.jpg");
         setIconImage(icone.getImage());
         setSize(250,250); 
         setLocationRelativeTo(null); 
         setResizable(false);
         Titulo = new JLabel ("Cadastro de clientes");
         Nome = new JLabel("Nome");
         Endereco = new JLabel("Endereco:");
         Cidade = new JLabel("Cidade:");
         Estado = new JLabel("Estado:");
         CEP = new JLabel("CEP:");
         Telefone = new JLabel("Telefone:");
         
        Titulo.setBounds(60,15,160,20);
        Nome.setBounds(50,35,80,50);
        Endereco.setBounds(50,55,80,60);
         Cidade.setBounds(50,75,80,70);
         Estado.setBounds(50,95,80,90);
         CEP.setBounds(50,115,80,90);
         Telefone.setBounds(50,135,80,100);
         
         Titulo.setForeground(Color.blue);
         Nome.setForeground(Color.black);
         Endereco.setForeground(Color.black);
         Cidade.setForeground(Color.black);
         Estado.setForeground(Color.black);
         CEP.setForeground(Color.black);
         Telefone.setForeground(Color.black);
         
          Titulo.setFont(new Font("Arial", Font.BOLD, 14));
          Nome.setFont(new Font("Arial", Font.BOLD, 14));
          Endereco.setFont(new Font("Arial", Font.BOLD, 14));
          Cidade.setFont(new Font("Arial", Font.BOLD, 14));
          Estado.setFont(new Font("Arial", Font.BOLD, 14));
          CEP.setFont(new Font("Arial", Font.BOLD, 14));
          Telefone.setFont(new Font("Arial", Font.BOLD, 14));
          
          tela.add(Titulo);
          tela.add(Nome);
          tela.add(Endereco);
          tela.add(Cidade);
          tela.add(Estado);
          tela.add(CEP);
          tela.add(Telefone);
          setVisible(true);
    }
    public static void main(String args[]) {//inicio da classe main
        //resultado do calculo
        janela_03 app = new janela_03();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//fim da classe main
}//fim da classe janela
