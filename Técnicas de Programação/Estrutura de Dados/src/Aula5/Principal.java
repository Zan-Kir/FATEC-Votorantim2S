
package Aula5;

/**
 *
 * @author muril
 */
public class Principal {
    
    public static void main(String[] args){
       
        ListaLigada minhaLista = new ListaLigada();
        minhaLista.add("Banana"); 
        minhaLista.add("Maca",  0);
        minhaLista.add("Pera", 1);
        minhaLista.add("Abacaxi", 1);
        System.out.println(minhaLista.concatenaNos());
        
        minhaLista.remover(3);

        System.out.println(minhaLista.concatenaNos());
                
        ListaDuplamenteLigada listaDupla = new ListaDuplamenteLigada();
        listaDupla.adicionar("Morango");
        listaDupla.adicionar("Uva", 0);
        listaDupla.adicionar("Mirtilo", 1);
        listaDupla.adicionar("Caju", 1);
        System.out.println(listaDupla.imprimirLista());
        listaDupla.remover(2);
        System.out.println(listaDupla.imprimirLista());
        
        ListaDuplamenteLigada listaOrdenada  = new ListaDuplamenteLigada();
        listaOrdenada.adicionaOrdenado(0, TipoOrdenacao.CRESCENTE);
        listaOrdenada.adicionaOrdenado(1, TipoOrdenacao.CRESCENTE);
        listaOrdenada.adicionaOrdenado(3, TipoOrdenacao.CRESCENTE);
        listaOrdenada.adicionaOrdenado(2, TipoOrdenacao.CRESCENTE);
        listaOrdenada.adicionaOrdenado(1, TipoOrdenacao.CRESCENTE);
        listaOrdenada.adicionaOrdenado(3, TipoOrdenacao.CRESCENTE);
        listaOrdenada.adicionaOrdenado(1, TipoOrdenacao.CRESCENTE);

    }
    
}

