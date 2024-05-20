/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author feh
 */
public class Exercicio4 {

    public static double calcularMedia(double [] valores) 
    {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    public static double calcularModa(double [] valores) 
    {
        int maxCount = 0;
        double moda = valores[0];
        for (int i = 0; i < valores.length; i ++) {
            int count = 0;
            for (int j = 0; j < valores.length; j ++) {
                if (valores[j] == valores [i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                moda = valores [i];
            }
        }
        return moda;
    }

    public static double calcularDesvioPadrao(double [] valores) 
    {
        double media = calcularMedia(valores);
        double somaQuadrados = 0;
        for (double valor : valores) {
            somaQuadrados += Math.pow(valor - media, 2);
        }
        return Math.sqrt(somaQuadrados / valores.length);
    }

    public static double[] extrairColuna(double [] [] matriz, int coluna)
    {
        double [] colunaValores = new double [matriz.length];
        for (int i = 0; i < matriz.length; i ++) {
            colunaValores [i] = matriz [i] [coluna];
        }
        return colunaValores;
    }

    public static double [] [] calcularEstatisticas(double [] [] alunos)
    {
        double [] [] resultado = new double [3] [4];


        for (int j = 1; j <= 4; j ++) 
        {
            double [] colunaValores = extrairColuna(alunos, j);
            resultado [0] [j - 1] = calcularMedia(colunaValores);      
            resultado [1] [j - 1] = calcularModa(colunaValores);      
            resultado [2] [j - 1] = calcularDesvioPadrao(colunaValores);
        }

        return resultado;
    }

    public static void main(String [] args) 
    {

        double [] [] alunos =
        {
            {1, 8, 5, 7, 6.67},
            {2, 3, 7, 5, 5},
            {3, 7, 4, 8, 6.33},
            {4, 0, 8, 7, 5},
            {5, 7, 4, 5, 5.33}
        };

        for (int i = 0; i < alunos.length; i ++) {
            double somaNotas = alunos [i] [1] + alunos [i] [2] + alunos [i] [3];
            alunos [i] [4] = somaNotas / 3;
        }

        double [] [] estatisticas = calcularEstatisticas(alunos);

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
}

