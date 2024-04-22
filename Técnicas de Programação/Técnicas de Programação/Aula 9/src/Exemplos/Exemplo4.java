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
public class Exemplo4 {
     private JFrame janela;
    
    public Exemplo4() {
        janela = new JFrame("Janela com BorderLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b1 = new JButton("Botão 1");
        JButton b2 = new JButton("Botão 2");
        JButton b3 = new JButton("Botão 3");
        JButton b4 = new JButton("Botão 4");
        JButton b5 = new JButton("Botão 5");
        Container c = janela.getContentPane();
        
        c.add(b1, BorderLayout.NORTH);
        c.add(b2, BorderLayout.SOUTH);
        c.add(b3, BorderLayout.EAST);
        c.add(b4, BorderLayout.WEST);
        c.add(b5, BorderLayout.CENTER);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    public static void main(String[] args) {
        new Exemplo4();
    }
}
