/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplodecod2;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Automotivo {
    private String modelo;
    private String marca;
    private Integer ano;
    private String cor;
    
    public Automotivo(){
        this("", "", 0 ,"");
    }
    public Automotivo(String modelo, String marca, Integer ano, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void provarExistencia() {
     //system.out.println("modelo: "+ this.getModelo));
     //system.out.println("marca: "+ this.getMarca));
     //sysstem.out.println("ano: " + this.getAno));
     //system.out.println("cor: "+ this.getCor));
     
     J0ptionPane.showMessageDialog(null, "modelo: "+ this.getModelo() + "\n Marca: "
             + this.getMarca() + "\n Ano: "+ this.getAno() + "\n Cor: " + this.getCor());
    //JOptionPane.showMessageDialog(null,"Marca: "this.getMarca());
    //JOptionPane.showMessageDialog(null,"Ano: "this.getAno());
    //JOptionPane.showMessageDialog(null,"Cor: "this.getCor());
    }
    public void entradaDados(){
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        setModelo(modelo);
        marca = JOptionPane.showInputDialog("Marca: ");
        setMarca(marca);
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        setAno(ano);
        String cor = JOptionPane.showInputDialog("cor: ");
        setCor(cor);
    }
    //Inicio do metodo main
    public static void main(String[] args) {
       //chamada aos metodos main
        Automotivo autol;
        autol = new Automotivo();
        autol.entradaDados();
        autol.provarExistencia();
        //todo codig application logic here
        //fim do metodo main
    }
    //Fim da classe automotivo
}
