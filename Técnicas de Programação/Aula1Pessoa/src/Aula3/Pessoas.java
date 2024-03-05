/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3;

/**
 *
 * @author Alunos
 */
public class Pessoas {
    //Atributos da classe
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private Pessoas mae;
    private Pessoas pai;
    private int numFilhos = 0;
    private Pessoas[] listaFilhos = new Pessoas[10];
    //******************************//
    
    //Métodos da Classe
    
    //******************************//
    
    //Contrutores da Classe
    public Pessoas(String nome) {
        this.nome = nome;
    }
    public Pessoas(String nome, Pessoas mae) {
        this(nome);
        this.mae = mae;
    }
    public Pessoas(String nome, Pessoas mae, Pessoas pai) {
        this(nome, mae);
        this.pai = pai;
    }
    
    //******************************//
    
    //Métodos de acessos aos atributos
    
    //Métodos Get
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getGenero() {
        return this.genero;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public Pessoas getMae() {
        return this.mae;
    }
    public Pessoas getPai() {
        return this.pai;
    }
    public Pessoas[] getListaFilhos() {
        return this.listaFilhos;
    }
    
    //Métodos Set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setMae(Pessoas mae) {
        this.mae = mae;
    }
    public void setPai(Pessoas pai) {
        this.pai = pai;
    }
    
    //Método para adicionar um filho a lista
    public void addFilho(Pessoas filho) {
        this.listaFilhos[numFilhos] = filho;
        numFilhos++;
    }
    
    //Métodos

    public String retornaListaFilhos() {
        // Este método deve retornar uma string com todos os filhos
        // concatenados e separados por ", "
        String resposta = "Os filhos da " + this.nome + " são: ";
        
        for (int i = 0; i < numFilhos; i++) {
            resposta += listaFilhos[i].getNome();
            if (i == numFilhos - 1) {
                resposta += ".";
            }
            else{
                resposta += ", ";
            }
        }
        if (numFilhos == 0) {
            resposta = "Não possui filhos.";
        }
        return resposta;
    }
}
