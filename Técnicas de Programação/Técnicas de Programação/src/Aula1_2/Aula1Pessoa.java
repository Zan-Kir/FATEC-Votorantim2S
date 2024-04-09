/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1_2;

/**
 *
 * @author Alunos
 */
public class Aula1Pessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Código da Aplicação vai aqui dentro
        
        Pessoa pai;
        pai = new Pessoa("Rodrigo", "333333");
        pai.nome = "Rodrigo";
        pai.qntFilhos = 2;
        pai.qntIrmaos = 4;
        
        System.out.println(pai.Apresentar()
                + " E possui " + pai.qntIrmaos + " irmãos.");
        pai.nomesIrmaos[0] =  "José";
        pai.nomesIrmaos[1] =  "Roberto";
        pai.nomesIrmaos[2] =  "Cleiton";
        pai.nomesIrmaos[3] =  "Matheus";
        System.out.println(pai.ApresentarIrmaos());
        
        System.out.println("CPF Pai: " + pai.getCpf());
        pai.setCpf("666666");
        System.out.println("Novo CPF Pai: " + pai.getCpf());
        
        Pessoa mae = new Pessoa("444444");
        mae.nome = "Paula";
        mae.qntFilhos = 2;
        
        /* para mudar o nome de uma variavel em todos locais,
        clica com o direito e seleciona refatorar > renomear */
        
        // se escrever sout e apertar ctrl ele autocompleta o print
        
        System.out.println(mae.Apresentar());
        // System.out.println(mae.ApresentarFilhos());
        mae.nomesFilhos[0] = "Maria";
        mae.nomesFilhos[1] = "João";
        System.out.println(mae.ApresentarFilhos());
    }
    
}
