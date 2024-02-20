/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    
    //Atributos da Classe
    String nome;
    int qntFilhos, qntIrmaos;
    String[] nomesFilhos = new String[20];
    
    
    /*Métodos da Classe
    Método "Apresentar", responde com o Nome
    concatenado com a quantidade de Filhos. */
    
    public String Apresentar() {
        return nome + " possui " + qntFilhos + " filhos.";
    }
    
    public String ApresentarFilhos() {
        String resposta = "Meus filhos são ";
        int qntFilhosAux = 0;
        
        for(int i = 0; i < 20; i++) {
            if (nomesFilhos[i] != null) {
                qntFilhosAux++;
                resposta += nomesFilhos[i] + ", ";   
            }           
        }
        
        if (qntFilhosAux > 0) {
            return resposta + "Quantidade de Filhos: " + qntFilhosAux;
        }
        else {
            return "Não possui filhos.";
        }
    }
}
