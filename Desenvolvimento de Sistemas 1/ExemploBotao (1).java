/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author dti
 */
public class ExemploBotao extends JFrame

{
     //Cria-se um objeto do tipo JButton
    JButton botão1,botão2,botão3,botão4;
   
    public ExemploBotao()
    
    {
        //Adiciona nome para a janela
        super ("Exemplo com JButton");
        
        Container tela = getContentPane();
        
        //Setar o Layout para utilizar o método setBounds
        setLayout(null);
        botão1 = new JButton ("Procurar");
        botão2 = new JButton ("Voltar >>");
        botão3 = new JButton ("Próximo >>");
        botão4 = new JButton ("Sair");
        
        botão1.setMnemonic(KeyEvent.VK_P);
        botão2.setMnemonic(KeyEvent.VK_V);
        botão3.setMnemonic(KeyEvent.VK_X);
        botão4.setMnemonic(KeyEvent.VK_S);

        
        //Definir uma largura,altura,coluna e linha do JButton para ser ocupado na janela
        botão1.setBounds(50,20,100,20);
        botão2.setBounds(50,60,100,20);
        botão3.setBounds(50,100,100,20);
        botão4.setBounds(50,140,100,20);
        
        //Pedi para adicionar os objetos na tela
        tela.add(botão1);
        tela.add(botão2);
        tela.add(botão3);
        tela.add(botão4);
         
        getRootPane().setDefaultButton(botão4);

          setSize(400,250);
         //Diz para que seja verdadeira a ação de visualizar a tela
          setVisible(true);
    }
    public static void main(String[] args) {
       ExemploBotao  app = new ExemploBotao();
        
        //Adiciona os icones principais da janela
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
                
            
    }
