/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author feh
 */
    public class Exercicio2 {

    public static String [] substituirValores(int [] numeros) 
    {
        String [] resultado = new String [5];

        for (int i = 0; i < numeros.length; i ++) {
            if (numeros[i] < 0) {
                resultado[i] = "N";
            } 
            else if (numeros[i] > 0) 
            {
                resultado[i] = "P";
            } 
            else 
            {
                resultado[i] = "0";
            }
        }

        return resultado;
    }

    public static void main(String [] args) {
        int [] numeros = {-2, 4, 6, -5, 7};
        String [] resultado = substituirValores(numeros);

        for (String s : resultado) {
            System.out.print(s + " ");
        }
    }
}


