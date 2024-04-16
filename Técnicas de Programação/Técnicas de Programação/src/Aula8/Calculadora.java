/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula8;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class Calculadora {
    public void Menu() {
        Scanner input = new Scanner(System.in);
        int comando;
        int x;
        int y;
        int result = 0;
        
        String imprime = "Digite a opcao: \n"
                + "1 - Soma \n"
                + "2 - Subtracao \n"
                + "3 - Multiplicacao \n"
                + "4 - Divisao \n"
                + "0 - Sair";
        System.out.println(imprime);
        comando = input.nextInt();
        while (comando != 0) {
            if (comando == 1) {
                System.out.println("Digite o primeiro valor: ");
                x = input.nextInt();
                System.out.println("Digite o segundo valor: ");
                y = input.nextInt();
                result = Calculo.Soma(x, y);
            }
            if (comando == 2) {
                System.out.println("Digite o primeiro valor: ");
                x = input.nextInt();
                System.out.println("Digite o segundo valor: ");
                y = input.nextInt();
                result = Calculo.Subtracao(x, y);
            }
            if (comando == 3) {
                System.out.println("Digite o primeiro valor: ");
                x = input.nextInt();
                System.out.println("Digite o segundo valor: ");
                y = input.nextInt();
                result = Calculo.Multiplicacao( x, y);
            }
            if (comando == 4) {
                System.out.println("Digite o primeiro valor: ");
                x = input.nextInt();
                System.out.println("Digite o segundo valor: ");
                y = input.nextInt();
                result = Calculo.Divisao(x, y);
            }
            if (comando > 4 || comando < 0) {
                System.out.println("Comando invalido");
            }
            
            System.out.println("\nResultado e: " + result + "\n");
            System.out.println(imprime);
            comando = input.nextInt();
        }
        
    }
}
