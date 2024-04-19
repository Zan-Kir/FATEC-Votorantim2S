
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
        
        ListaDuplamenteLigada listaOrdenada2 = new ListaDuplamenteLigada();
        listaOrdenada2.adicionaOrdenado(33, TipoOrdenacao.DESCRESCENTE);
        listaOrdenada2.adicionaOrdenado(8, TipoOrdenacao.DESCRESCENTE);
        listaOrdenada2.adicionaOrdenado(7, TipoOrdenacao.DESCRESCENTE);
        listaOrdenada2.adicionaOrdenado(2, TipoOrdenacao.DESCRESCENTE);
        listaOrdenada2.adicionaOrdenado(5, TipoOrdenacao.DESCRESCENTE);
        listaOrdenada2.adicionaOrdenado(3, TipoOrdenacao.DESCRESCENTE);
        listaOrdenada2.adicionaOrdenado(23, TipoOrdenacao.DESCRESCENTE);
        listaOrdenada2.adicionaOrdenado(30, TipoOrdenacao.DESCRESCENTE);
        listaOrdenada2.adicionaOrdenado(60, TipoOrdenacao.DESCRESCENTE);
        
        ListaCircular listaCircular = new ListaCircular();
        listaCircular.adicionar("Melancia", 0);
        listaCircular.adicionar("Pitaya");
        listaCircular.adicionar("Guarana", 1);
        listaCircular.adicionar("Kiwi");
        listaCircular.adicionar("Maracuja", 1);
        listaCircular.remover(0);
        listaCircular.remover(1);
        System.out.println(listaCircular.imprimirLista("", listaCircular.primeiroNo, 0));
        
        


    }
    
}

