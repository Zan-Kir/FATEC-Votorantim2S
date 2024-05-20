
package PersistenciaDados;

import java.io.Serializable;


public class Motocicleta implements Serializable {
    //atributos
    private String marca, modelo;


    private float velocidade;
    
    //construtor
    public Motocicleta(String marca, String modelo, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    
    //metodos
    public float alterarVelocidade(float fatorAceleracao) {
        velocidade = velocidade*fatorAceleracao;
        return velocidade;
    }
    
    public float parar() {
        velocidade = 0;
        return velocidade;
    }

    public float getVelocidade() {
        return this.velocidade;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
