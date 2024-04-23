/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastrarProduto;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class Produto {
    //atributos
    private int ID;
    private String nome;
    private String desc;
    private List<Imposto> impostos;
    private List<MateriaPrima> matPrima;
    private List<Margens> margens;
    private float valorVenda;
    
    //construtores
    public Produto(int id, String nome) {
        this.ID = id;
        this.nome = nome;
        this.impostos = new ArrayList();
        this.matPrima = new ArrayList();
        this.margens = new ArrayList();
    }
    public Produto(int id, String nome, String desc, List impostos, List materiaPrima, List margens, float valorVenda) {
        this(id,nome);
        this.desc = desc;
        this.impostos = impostos;
        this.matPrima = materiaPrima;
        this.margens = margens;
        this.valorVenda = valorVenda;
    }
    
    //impostos
    public boolean removerImposto(Imposto imposto) {
        return impostos.remove(imposto);
    }
    public void addImposto(Imposto imposto) {
        impostos.add(imposto);
    }
    
    //materiais
    public boolean removerMatPrima(MateriaPrima mat) {
        return matPrima.remove(mat);
    }
    public void addMatPrima(MateriaPrima mat) {
        matPrima.add(mat);
    }
    
    //Métodos get
    public int getID() {
        return this.ID;
    }
    public String getNome() {
        return this.nome;
    }
    public String getDesc() {
        return this.desc;
    }
    public List<Imposto> getImposto() {
        return this.impostos;
    }
    public List<MateriaPrima> getMatPrima() {
        return this.matPrima;
    }
    public List<Margens> getMargens() {
        return this.margens;
    }
    public float getValor() {
        return this.valorVenda;
    }
    
    //Métodos Set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setValor(float valor) {
        this.valorVenda = valor;
    }
}

