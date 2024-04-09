/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4;

/**
 *
 * @author Alunos
 */
import java.util.ArrayList;
import java.util.List;
 
public class FilaComLista {
    //DECLARAR OS ATRIBUTOS DO OBJETO
    List fila = new ArrayList<Integer>();
    //METODOS DA CLASSE FILA
    //ADICIONAR UM INTEIRO NO FINAL DA FILA
    //quando nao tem retorno é utilizado o void
    public void adicionar(Integer item){
        if (item>=65){
        fila.add(0, item);
        }
        else {
        fila.add(item);
        }
    }
    public int tamanho(){
        return fila.size();
    }
 
    //Neste caso esta convertendo o inteiro para a função e para o retorno
    public Object exibirInicio() {
        //MOSTRA O INDICE 0
     return (Integer) fila.get(0);
}
    public Object remover() {
        // REMOVE O INDICE, QUE ESTA DENTRO DO PARENTESES
        return (Integer) fila.remove(0);
    }
}