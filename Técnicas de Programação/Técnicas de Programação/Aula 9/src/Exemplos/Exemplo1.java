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
public class Exemplo1 {
    private JFrame janela;
    
    public Exemplo1()
    {
        janela = new JFrame("Primeira Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = janela.getContentPane();
        JLabel rotulo = new JLabel ("Elemento JLabel");
        JButton botao = new JButton ("Botão Simples");
        c.setLayout(new FlowLayout());
        c.add(botao);
        c.add(rotulo);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    public static void main(String[] args) {
        Exemplo1 p = new Exemplo1();
    }
}
