/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula6;

/**
 *
 * @author Alunos
 */
public class Cliente {
    //Atributos
    private String nome;
    private String CPF;
    private String endereco;
    
    //Construtor
    public Cliente(String nome, String CPF, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    
    //gets
    public String getNome() {
        return this.nome;
    }
    public String getCPF() {
        return this.CPF;
    }
    public String getEnde() {
        return this.endereco;
    }
}

