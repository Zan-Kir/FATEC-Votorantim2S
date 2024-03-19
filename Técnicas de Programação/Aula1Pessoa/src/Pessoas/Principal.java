/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

/**
 *
 * @author Alunos
 */
public class Principal {

       public static void main(String[] args) {
        Pessoa maeDoJoao = new Pessoa("Maria");
        Pessoa Joao=new Pessoa("João",maeDoJoao);
        
        
        Pessoa irmaoJoao = new Pessoa("Jorel",maeDoJoao);
           System.out.println("Nome: " + Joao.getNome());
           Joao.setNome("João dos Santos");
           System.out.println("Nome: " + Joao.getNome());
           maeDoJoao.addFilho(Joao);
           maeDoJoao.addFilho(irmaoJoao);
           System.out.println("Mãe do João: "+Joao.getMae().getNome());
           System.out.println("Irmão do João: "+Joao.getMae().getListaFilhos()[1].getNome());
       
       }
    
}

