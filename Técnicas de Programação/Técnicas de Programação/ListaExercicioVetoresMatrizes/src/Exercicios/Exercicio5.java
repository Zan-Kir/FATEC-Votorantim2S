/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author feh
 */
public class Exercicio5 {

    public static void imprimirMatrizEstatisticas(double [] [] estatisticas) 
    {
        String [] titulos = {"Media", "Moda", "Desvio Padrao"};
        String [] colunas = {"P1", "P2", "P3", "Pmedia"};

        for (int i = 0; i < estatisticas.length; i ++) {
            System.out.print(titulos [i] + ": ");
            for (int j = 0; j < estatisticas [i].length; j ++) {
                System.out.print(colunas [j] + " = " + estatisticas [i] [j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args) 
    {
        double [] [] estatisticas = {
            {6.4, 5.0, 2.46, 5.0},
            {7.0, 7.0, 1.41, 7.0},
            {2.6, 2.0, 1.87, 2.0}
        };

        System.out.println("Matriz de Estatísticas:");
        imprimirMatrizEstatisticas(estatisticas);
    }
}

