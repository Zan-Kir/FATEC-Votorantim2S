/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Alunos
 */
public class Principal {
    public static void main(String[] args) {
        PilhaVetor pilhaA = new PilhaVetor(8);
        pilhaA.empilhar("A");
        pilhaA.empilhar("B");
        pilhaA.empilhar("C");
        pilhaA.empilhar("D");
        pilhaA.empilhar("E");
        pilhaA.empilhar("F");
        pilhaA.empilhar("G");
        pilhaA.empilhar("H");
        System.out.println("Pilha cheia?: " + pilhaA.verificaPilhaCheia());
        pilhaA.empilhar("I");
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Pilha vazia?: " + pilhaA.verificaPilhaVazia());
        System.out.println(pilhaA.desempilhar());
    }
}
