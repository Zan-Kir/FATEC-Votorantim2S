
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
        listaDupla.add("Banana");
        listaDupla.add("Maca", 0);
        listaDupla.add("Pera", 1);
        System.out.println(listaDupla);
    }
    
}

