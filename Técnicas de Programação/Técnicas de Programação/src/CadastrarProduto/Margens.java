/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastrarProduto;

/**
 *
 * @author Alunos
 */
public class Margens {
    String nome;
    String desc;
    double percentual;
    
    public Margens(String nome, String desc, double percentual) {
        this.nome = nome;
        this.desc = desc;
        this.percentual = percentual;
    }
    
    //Métodos get
    public String getNome(){
        return this.nome;
    }
    public String getDesc() {
        return this.desc;
    }
    public double getPercentual() {
        return this.percentual;
    }

    
    //Métodos set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setValor(double percentual) {
        this.percentual = percentual;
    }
}
