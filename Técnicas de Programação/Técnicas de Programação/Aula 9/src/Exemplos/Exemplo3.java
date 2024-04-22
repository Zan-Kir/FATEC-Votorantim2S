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
public class Exemplo3 {
     private JFrame janela;
    
    public Exemplo3() {
        janela = new JFrame("Janela com FlowLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b1 = new JButton("Botão 1");
        JButton b2 = new JButton("Botão 2");
        JButton b3 = new JButton("Botão 3");
        Container c = janela.getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        c.add(b1);
        c.add(b2);
        c.add(b3);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    public static void main(String[] args) {
        new Exemplo3();
    }
}
