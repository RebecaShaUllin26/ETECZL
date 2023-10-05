/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exempjpasswordfield;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author dti
 */
public class Exempsenha extends JFrame{
    JPasswordField caixa;
    JLabel rotulo;
    public Exempsenha(){
        super("exemplo com JPasswordField");
        Container tela=getContentPane();
        setLayout(null);
        rotulo= new JLabel("Senha: ");
        caixa= new JPasswordField(10);
        rotulo.setBounds(50,20,100,20);
        caixa.setBounds(50,60,100,20);
        tela.add(rotulo);
        tela.add(caixa);
        setSize(400,250);
        setVisible(true);
    }
    public static void main(String[] args){
        Exempsenha app= new Exempsenha();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
