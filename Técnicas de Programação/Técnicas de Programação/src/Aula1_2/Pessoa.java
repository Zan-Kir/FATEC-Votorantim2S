/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1_2;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    
    //Atributos da Classe
    String nome;
    int qntFilhos, qntIrmaos;
    String[] nomesFilhos = new String[20];
    String[] nomesIrmaos = new String[10];
    private String cpf; //variaveis privadas sao representadas por "-"
    
    /* Método Construtor */
    //construtores não possuem retorno
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf) {
        this(nome); //chama o construtor Pessoa(String nome).
        this.cpf = cpf; //torna obrigatorio o uso do cpf para instanciar pessoa.
    }
    
    /* Método Setter */
    //metodos setters não precisam ter retorno por isso usa void.
    public void setCpf(String cpf) {
        if(this.cpf == null) { //verifica se o cpf é nulo, se V pode atribuir
            this.cpf = cpf;
        } //somente em construtores nao usa o ponto "."
    }
    
    /* Método Getter */
    public String getCpf() { //metodos get nao precisam de parametro.
        return this.cpf; //é necessario o retorno.
    }
    
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
    
    public String ApresentarIrmaos() {
        String resposta = "Meus Irmaos são: ";
        int qntIrmaosAux = 0;
        
        for(int i = 0; i < 10; i++) {
            if (nomesIrmaos[i] != null) {
                qntIrmaosAux++;
                resposta += nomesIrmaos[i] + ", ";
            }
        }
        if (qntIrmaosAux > 0) {
            return resposta + "Quantidade de irmãos: " + qntIrmaosAux;
        }
        else {
            return "Não possui irmãos.";
        }
    }
}
