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
public class Exemplo6 {
         private JFrame janela;
    
    public Exemplo6() {
        janela = new JFrame("Janela com GridLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b1 = new JButton("A"); JButton b2 = new JButton("B");
        JButton b3 = new JButton("C"); JButton b4 = new JButton("D");
        JButton b5 = new JButton("E"); JButton b6 = new JButton("F");
        JPanel p = new JPanel(new GridLayout(2, 3));
        p.add(b1); p.add(b2);
        p.add(b3); p.add(b4);
        p.add(b5); p.add(b6);
        
        Container c = janela.getContentPane();
        c.add(p, BorderLayout.CENTER);

        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    public static void main(String[] args) {
        new Exemplo6();
    }
}
