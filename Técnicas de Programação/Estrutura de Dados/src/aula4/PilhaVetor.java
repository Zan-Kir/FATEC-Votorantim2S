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
/*

*/

public class PilhaVetor {
    //Atributos de classe são variaveis globais
    int registraTopo;
    String[] vetorPilha;
    
    //construtor de classe
    public PilhaVetor(int tamanho) {
        registraTopo = 0;
        vetorPilha = new String[tamanho];
    }
    
    //métodos de classe
    public void empilhar(String entrada) {
        if (verificaPilhaCheia()) {
            System.out.println("Erro. A pilha está cheia.");
        }
        else {
        vetorPilha[registraTopo] = entrada;
        registraTopo++;
        }
    }
    
    public String desempilhar() {
        if (verificaPilhaVazia()) {
            return "Erro. A pilha já está vazia.";
        } else {
        registraTopo--;
        return vetorPilha[registraTopo];
        }
    }
    public boolean verificaPilhaCheia() {
        if (registraTopo == vetorPilha.length) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean verificaPilhaVazia() {
        if (registraTopo == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
