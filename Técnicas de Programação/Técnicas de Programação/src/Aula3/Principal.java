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
public class Principal {
    public static void main(String[] args) {
        Pessoas maeDoJoao = new Pessoas("Maria");
        Pessoas paiDoJoao = new Pessoas("Pedro");
        Pessoas joao = new Pessoas("Joao", maeDoJoao, paiDoJoao);
        Pessoas irmaoJoao = new Pessoas("Jorel", maeDoJoao);
        System.out.println("Nome: " + joao.getNome());
        maeDoJoao.addFilho(joao);
        maeDoJoao.addFilho(irmaoJoao);
        joao.addFilho(new Pessoas("Jose"));
        System.out.println(joao.getListaFilhos()[0].getNome());
        System.out.println("Mãe do João: " + joao.getMae().getNome());
        System.out.println(joao.getMae().getListaFilhos()[0].getNome());
        System.out.println(maeDoJoao.retornaListaFilhos());
    }
}
