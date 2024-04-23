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
public class MateriaPrima {
    //Atributos
    String nome;
    String desc;
    float valorCompra;
    List impostoMatPrima;
    
    //construtores
    public MateriaPrima(String nome, String desc) {
        this.nome = nome;
        this.desc = desc;
        this.valorCompra = 0;
        this.impostoMatPrima = new ArrayList();
 
    }
    public MateriaPrima(String nome, String desc, float valorCompra, List impostos) {
        this(nome, desc);
        this.valorCompra = valorCompra;
        this.impostoMatPrima =  impostos;
    }
    public boolean removerImposto(Imposto imposto) {
        return impostoMatPrima.remove(imposto);
    }
    public void addImposto(Imposto imposto) {
        impostoMatPrima.add(imposto);
    }
    
    //Métodos get
    public String getNome(){
        return this.nome;
    }
    public String getDesc() {
        return this.desc;
    }
    public float getValor() {
        return this.valorCompra;
    }
    public List<Imposto> getImpostos() {
        return this.impostoMatPrima;
    }
    
    //Métodos set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setValor(float valor) {
        this.valorCompra = valor;
    }
}
