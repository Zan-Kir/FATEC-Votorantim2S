/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvore;

/**
 *
 * @author Alunos
 */
public class TesteArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria b1 = new ArvoreBinaria(5);
        b1.addNoOrdenado(3);
        b1.addNoOrdenado(1);
        b1.addNoOrdenado(2);
        b1.addNoOrdenado(4);
        b1.addNoOrdenado(8);
        b1.addNoOrdenado(7);
        b1.addNoOrdenado(6);
        b1.addNoOrdenado(9);
        
        b1.imprimirPreOrdem();
        b1.imprimirEmOrdem();
        //b1.imprimirPosOrdem();
    }
    
}
