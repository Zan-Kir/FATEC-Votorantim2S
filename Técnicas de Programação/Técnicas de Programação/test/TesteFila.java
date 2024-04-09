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
import org.junit.Test;
import static org.junit.Assert.*;
 
 
public class TesteFila {
    @Test
    public void adicionarUmItem(){
        FilaComLista fila = new FilaComLista();
        fila.adicionar(0);
        assertEquals(1, fila.tamanho());
    }
    @Test
    public void adicionarTresItem(){
        FilaComLista fila = new FilaComLista();
        fila.adicionar(0);
        fila.adicionar(1);
        fila.adicionar(2);
        assertEquals(3, fila.tamanho());
    }
     @Test
    public void adicionarTresItemRemoveDois(){
        //PARA FILA, O PRIMEIRO QUE ENTRA É O PRIMEIRO QUE SAI FIFO.
        FilaComLista fila = new FilaComLista();
        fila.adicionar(0);
        fila.adicionar(1);
        fila.adicionar(2);
        assertEquals(3, fila.tamanho());
        assertEquals(0, fila.remover());
        assertEquals(1, fila.remover());
        assertEquals(2, fila.exibirInicio());
        assertEquals(1, fila.tamanho());
    }

         @Test
    public void adicionarTresItemRemoveDoisListaPrioridade(){
        //PARA FILA, O PRIMEIRO QUE ENTRA É O PRIMEIRO QUE SAI FIFO.
        FilaComLista fila = new FilaComLista();
        fila.adicionar(0);
        fila.adicionar(67);
        fila.adicionar(46);
        assertEquals(3, fila.tamanho());
 
        assertEquals(67, fila.exibirInicio());
 
    }
    }
