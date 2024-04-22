/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author muril
 */
public class Exercicio1 {
    private JFrame janela;
    private JPanel pNorth, pCenter, pSouth;
    private JButton calcular;
    private JLabel label1, label2, label3, tempo;
    private JTextField text1, text2, text3;
    
    public Exercicio1() {
        janela = new JFrame("Exercício");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pNorth = new JPanel();
        calcular = new JButton("Calcular");
        pNorth.add(calcular);
        pNorth.setBackground(Color.orange);
        
        pSouth = new JPanel();
        tempo = new JLabel("Tempo = 0");
        pSouth.add(tempo);
        pSouth.setBackground(Color.yellow);
        
        pCenter = new JPanel(new GridLayout(3, 2));
        pCenter.setBackground(Color.white);
        label1 = new JLabel("Espaço Inicial:");
        label2 = new JLabel("Velocidade Inicial:");
        label3 = new JLabel("Aceleração:");
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        pCenter.add(label1);
        pCenter.add(text1);
        pCenter.add(label2);
        pCenter.add(text2);
        pCenter.add(label3);
        pCenter.add(text3);
        
        Container c = janela.getContentPane();
        c.add(pNorth, BorderLayout.NORTH);
        c.add(pSouth, BorderLayout.SOUTH);
        c.add(pCenter, BorderLayout.CENTER);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
        public static void main(String[] args) {
        new Exercicio1();
    }
}
