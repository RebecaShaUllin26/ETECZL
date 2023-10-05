/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrao;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dti
 */
public class ExemploLabel  extends JFrame 
        
{
    //Cria-se os objetos do tipo JLabel
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    
    public  ExemploLabel ()
    {
       super ("Exemplo com Label");
       
       Container tela = getContentPane();
       setLayout(null);
       
       //Atribui uma nomeclatura para cada objeto
       rotulo1 = new JLabel ("Nome");
       rotulo2 = new JLabel ("Idade");
       rotulo3 = new JLabel ("Telefone");
       rotulo4 = new JLabel ("Celular");
       
       //Definir uma largura,altura,coluna e linha do JLabel para ser ocupado na janela
       rotulo1.setBounds(50,20,80,20);
       rotulo2.setBounds(50,60,80,20);
       rotulo3.setBounds(50,100,80,20);
       rotulo4.setBounds(50,140,80,20);
       
       //Atribui cor para os objetos
       rotulo1.setForeground(Color.red);
       rotulo2.setForeground(Color.blue);
       rotulo3.setForeground(new Color (190,152,142));
       rotulo4.setForeground(new Color (201,200,100));
       
       //Atribui o tipo de fonte para cada objeto
       rotulo1.setFont(new Font("Arial",Font.BOLD,14));
       rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
       rotulo3.setFont(new Font("Couner New",Font.BOLD,18));
       rotulo4.setFont(new Font("Times New Roman",Font.BOLD,20));
       
       //Pedi para que os objetos criados sejam adicionados a tela
       tela.add(rotulo1);
       tela.add(rotulo2);
       tela.add(rotulo3);
       tela.add(rotulo4);
       
       //Defini as medidas da tela
       setSize(400,250);
       
       //Diz para que seja verdadeira a ação de visualizar a tela
       setVisible(true);
      
       //Pedi para que a janela fique no meio
       setLocationRelativeTo(null);
       

    }
    
    public static void main(String[] args) {
        ExemploLabel app = new ExemploLabel();
        
        //Adiciona os icones principais da janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
