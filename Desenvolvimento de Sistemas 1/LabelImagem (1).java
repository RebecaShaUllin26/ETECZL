/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelaexemp;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dti
 */
public class LabelImagem extends JFrame{
    JLabel imagem;
    public LabelImagem(){
        super("uso da classe JLabel com imagem");
        Container tela= getContentPane();
        ImageIcon icone = new ImageIcon("bests.jpg");
        imagem = new JLabel(icone);
        tela.add(imagem);
        setSize(500,460);
        setVisible(true);
    }
    public static void main(String args[]){
        LabelImagem app = new LabelImagem();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
