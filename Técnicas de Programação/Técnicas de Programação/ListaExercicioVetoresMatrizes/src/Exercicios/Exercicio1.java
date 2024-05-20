/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author feh
 */
public class Exercicio1 {

    public static int calcularArea(int [] catetos) 
    {
        int cateto1 = catetos[0];
        int cateto2 = catetos[1];

        int area = (cateto1 * cateto2) / 2;

        return area;
    }

    public static void main(String[] args) 
    {
        int [] catetos = {3, 4};
        int area = calcularArea(catetos);
        System.out.println("A area do triangulo retangulo e: " + area);
    }
}
