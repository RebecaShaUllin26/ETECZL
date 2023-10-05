/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exempjpasswordfield;

import java.awt.Container;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author dti
 */
public class ExempJFormattedTextField extends JFrame{
     JLabel rotulocep,rotulotel,rotulocpf,rotulodata;
    JFormattedTextField cep,tel,cpf,data;
    MaskFormatter mascaracep,mascaratel,mascaracpf,mascaradata;
    
    public  ExempJFormattedTextField(){
        super("exemplo com JFormattedTextField");
        Container tela= getContentPane();
        setLayout(null);
        
        rotulocep= new JLabel("CEP: ");
        rotulotel= new JLabel("Telefone: ");
        rotulocpf= new JLabel("CPF: ");
        rotulodata= new JLabel("data: ");
        
        rotulocep.setBounds(50,40,100,20);
        rotulotel.setBounds(50,80,100,20);
        rotulocpf.setBounds(50,120,100,20);
        rotulodata.setBounds(50,160,100,20);
     try{
        mascaracep= new MaskFormatter("#####-###");
        mascaratel= new MaskFormatter("(##)###-####");
        mascaracpf= new MaskFormatter("#########-##");
        mascaradata= new MaskFormatter("##/##/###");
    
        mascaracep.setPlaceholderCharacter('_');
        mascaratel.setPlaceholderCharacter('_');
        mascaracpf.setPlaceholderCharacter('_');
        mascaradata.setPlaceholderCharacter('_');
       } 
     catch(ParseException excp){
    
    cep= new JFormattedTextField(mascaracep);
    tel= new JFormattedTextField(mascaracep);
    cpf= new JFormattedTextField(mascaracep);
    data= new JFormattedTextField(mascaracep);
   } 
     
        cep.setBounds(150,40,100,20);
        tel.setBounds(150,80,100,20);
        cpf.setBounds(150,120,100,20);
        data.setBounds(150,160,100,20);
        
        tela.add(rotulocep);
        tela.add(rotulotel);
        tela.add(rotulocpf);
        tela.add(rotulodata);
        
        setSize(400,250);
        setVisible(true);
        
  } 
    public static void main(String[]args){
      ExempJFormattedTextField app= new ExempJFormattedTextField();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  }

