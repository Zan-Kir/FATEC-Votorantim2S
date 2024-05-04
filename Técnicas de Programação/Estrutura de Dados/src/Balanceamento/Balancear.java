/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Balanceamento;

/**
 *
 * @author Alunos
 */
public class Balancear {
    public static void main(String[] args) {
        String vetor[] = new String[]{"{","}"};
        System.out.println(validaBalanceamento(vetor));
        String vetor2[] = new String[] {"{", "}"};
        System.out.println(validaBalanceamento(vetor2));
}
    

    public static boolean validaBalanceamento(String[] vetor) {
        PilhaLista pilhaAux = new PilhaLista();
        for(int i=0; i < vetor.length; i++) {  
            //vetor[i] = simbolo de abertura
            if(vetor[i] == "{" || vetor[i] == "(" || vetor[i] == "["){
            //adiciona o símbolo de fechamento equivalente a pilha
                if (vetor[i] == "{"){
                    pilhaAux.empilhar("}");
                }
                if (vetor[i] == "(") {
                    pilhaAux.empilhar(")");
                }
                if (vetor[i] == "[") {
                    pilhaAux.empilhar("]");
                }   
            }
        
            if(vetor[i] == "}" || vetor[i] == ")" || vetor[i] == "]") {
                        //adiciona o símbolo de fechamento equivalente a pilha
                if(pilhaAux.pilhaVazia()) {
                    return false;
                }
                if (vetor[i] != pilhaAux.desempilhar()){
                    return false;
                }
            }
        }
        if(pilhaAux.pilhaVazia()){
            return true;
        } else {
            return false;
        }
    }
}
