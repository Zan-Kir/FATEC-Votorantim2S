/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplos;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author muril
 */
public class Exemplo5 {
     private JFrame janela;
    
    public Exemplo5() {
        janela = new JFrame("Janela com GridLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b1 = new JButton("A"); JButton b2 = new JButton("B");
        JButton b3 = new JButton("C"); JButton b4 = new JButton("D");
        JButton b5 = new JButton("E"); JButton b6 = new JButton("F");
        Container c = janela.getContentPane();
        c.setLayout(new GridLayout(2, 3));
        
        c.add(b1); c.add(b2);
        c.add(b3); c.add(b4);
        c.add(b5); c.add(b6);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    public static void main(String[] args) {
        new Exemplo5();
    }
}
