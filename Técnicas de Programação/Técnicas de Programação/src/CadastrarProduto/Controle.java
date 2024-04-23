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
public class Controle {
    public static void main(String[] args) {
        //criar impostos
        Imposto icms = new Imposto("ICMS", "Imposto de ICMS", 0.08);
        Imposto confins = new Imposto("COFINS", "Imposto de COFINS", 0.02);
        List<Imposto> impostos1 = new ArrayList();
        impostos1.add(icms);
        impostos1.add(confins);
        
        //criar MateriaPrima
        MateriaPrima madeira = new MateriaPrima("Madeira", "Madeira de Carvalho", 20, impostos1);
        MateriaPrima aco = new MateriaPrima("Aco", "Placa de Aco");
        List<MateriaPrima> materiasPrima = new ArrayList();
        materiasPrima.add(madeira);
        materiasPrima.add(aco);
        
        //criar Margens
        List<Margens> margemLucro = new ArrayList();
        Margens lucro = new Margens("Lucro","Margem de Lucro", 0.2);
        margemLucro.add(lucro);
        
        //Criar
        Produto Faca = new Produto(1, "Faca", "Faca afiada", impostos1, materiasPrima, margemLucro, 25);
        System.out.println("Produto: " + Faca.getNome()+"\n" + "Descricao: " + Faca.getDesc() + "\n" +
                "Impostos: " + Faca.getImposto() + "\n" + "Materias Primas: " + Faca.getMatPrima() + "\n" +
                "Lucros: " + Faca.getMargens() + "\n" + Faca.getValor());
    }
}
