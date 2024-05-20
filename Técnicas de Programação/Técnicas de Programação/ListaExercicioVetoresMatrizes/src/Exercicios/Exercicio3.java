/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author feh
 */
public class Exercicio3 {

    public static double [] [] calcularMedias(double [] [] matriz) 
    {
        for (int i = 0; i < matriz.length; i++) {
            double somaNotas = 0;
            for (int j = 1; j <= 3; j++) {
                somaNotas += matriz [i] [j];
            }
            double media = somaNotas / 3;
            matriz [i] [4] = media;
        }
        return matriz;
    }

    public static void main(String [] args) 
    {
        
        double [] [] alunos = {
            {001, 8, 5, 7, 0},
            {002, 3, 7, 5, 0},
            {003, 7, 4, 8, 0},
            {004, 0, 8, 7, 0},
            {005, 7, 4, 5, 0}
        };

        double [] [] resultado = calcularMedias(alunos);

        for (double [] aluno : resultado) {
            System.out.print("RA: " + (int) aluno [0] + " Notas: ");
            for (int j = 1; j <= 3; j++) {
                System.out.print(aluno [j] + " ");
            }
            System.out.println("Media: " + aluno [4]);
        }
    }
}
