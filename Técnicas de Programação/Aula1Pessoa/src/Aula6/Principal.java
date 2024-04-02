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
public class Principal {
    public static void main(String[] args) {
        Cliente jose = new Cliente("jose", "333333", "AV Rosa");
        ContaBancaria contaDoJose = new ContaBancaria(jose, TipoConta.CC, StatusConta.A);
        System.out.println(contaDoJose.cliente.getNome());
        System.out.println(contaDoJose.cliente.getCPF());
        System.out.println(contaDoJose.cliente.getEnde());
        System.out.println(contaDoJose.tipoConta);
        System.out.println(contaDoJose.statusConta);
        System.out.println(contaDoJose.saldoConta);
        System.out.println(contaDoJose.depositar(200));
        System.out.println(contaDoJose.retirar(50));
        System.out.println(contaDoJose.cobrarTaxa());
        System.out.println(contaDoJose.extratoConta());
                
        
    }
}
