/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quadrad;
/**
 *
 * @author casa
 */
import javax.swing.JOptionPane;
public class quadrad {

    public static void main(String[] args) {
        {
            int a = 0, b = 0, c = 0, d = 0, r = 0 ;
             a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 numero"));
             b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 numero"));
             c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3 numero"));
             d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4 numero"));
             r = (a * b) + (a * c) + (a * d);
             JOptionPane.showMessageDialog(null, "O resultado é: " +  r);
        }
    }
}
