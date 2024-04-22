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
public class Exemplo2 {
    private JFrame janela;
    
    public Exemplo2()
    {
        janela = new JFrame("Janela com Componentes");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
        JLabel label = new JLabel("Elemento JLabel");
        JButton botao = new JButton("Botão Simples");
        JButton outro = new JButton("Outro Botão");
        
        p1.setBackground(Color.yellow);
        p2.setBackground(Color.white);
        p1.add(label);
        p2.add(botao);
        p3.add(outro);
        
        Container c = janela.getContentPane();
        c.setLayout(new BorderLayout());

        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.SOUTH);
        c.add(p3, BorderLayout.EAST);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    public static void main(String[] args) {
        new Exemplo2();
    }
}
