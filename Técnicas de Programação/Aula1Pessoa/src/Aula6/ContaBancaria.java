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

public class ContaBancaria {
   Cliente cliente;
   TipoConta tipoConta;
   float saldoConta;
   StatusConta statusConta;
   String extrato = "";
    
    //construtor
   public ContaBancaria(Cliente cliente, TipoConta tipoConta, StatusConta statusConta){
       this.cliente = cliente;
       this.tipoConta = tipoConta;
       this.saldoConta = 0;
       this.statusConta = statusConta;
   }
   
   //métodos
   public String depositar(float dinheiro) {
       saldoConta += dinheiro;
       extrato += "Valor Depositado: " + dinheiro + "\n";
       return "Novo Saldo: " + saldoConta;
   }
    public String retirar(float dinheiro) {
       saldoConta -= dinheiro;
       extrato += "Valor Retirado: " + dinheiro + "\n";
       return "Novo Saldo: " + saldoConta;
   }
    public String cobrarTaxa() {
       if (tipoConta == TipoConta.CC) {
           saldoConta -= 19.99;
           extrato += "Taxa Cobrada: " + 19.99 + "\n";
       }
       if (tipoConta == TipoConta.CP) {
           saldoConta -= 9.99;
           extrato += "Taxa Cobrada: " + 9.99 + "\n";
       }
       return "Novo Saldo: " + saldoConta;
   }
    public String verificaSaldo() {
       return "Saldo: " + saldoConta;
   }
    public String extratoConta() {
       return "Extrato da conta: \n" + extrato;
   }
}


