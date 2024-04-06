
package Aula5;

/**
 *
 * @author muril
 */
public class ListaLigada {
    //Atributos
    No primeiroNo;
    No ultimoNo;
    int tamanhoLista;
    
    public ListaLigada(){
        tamanhoLista=0;
        primeiroNo= ultimoNo = null;
    }
    public void add(Object elemento){
        //Adiciona um nó na ultima posição.
        //Para o 1º Nó
        No aux = new No(elemento, null);
            
        if(primeiroNo==null && ultimoNo==null){
            primeiroNo= ultimoNo = aux;
            tamanhoLista++;
        }
        else{// Para os demais nós
            ultimoNo.setProximoNo(aux);
            tamanhoLista++;
        }
    }
    public void add(Object elemento, int indice){
        /*Método deverá adicionar o elemento na posição
        indicada pelo indice */
        
        //checa se a posição é válida
        if (indice > tamanhoLista || indice < 0){
            System.out.println("Erro indice inválido");
        }
        
        //cria um novo Nó
        No novo = new No(elemento, null);
        
        //define se é o Primeiro Nó
        if (indice == 0) {
           novo.setProximoNo(primeiroNo);
           primeiroNo = novo;
        }
        
        //define em outra posição
        else {
            No atual = primeiroNo;
            //indice -1 pra achar o nó anterior que é onde sera inserido
            for(int i = 0; i < indice -1; i++) {
                  atual = atual.getProximoNo();
            }
            
            novo.setProximoNo(atual.getProximoNo()); //esse faz o atual apontar pro proximo
            atual.setProximoNo(novo); // esse faz o anterior apontar pro atual
        }
        
        //define ultimo nó se for colocado no final da lista
        if (indice == tamanhoLista) {
            ultimoNo = novo;
        }
        //acrescenta no total da lista
         tamanhoLista++;
    }
    public Object remover(int indice){
        /*Remove o elemento indicado pelo indice 
        e retorna esse objeto*/
        
        //checa se a posição é válida
        if (indice > tamanhoLista || indice < 0){
            System.out.println("Erro indice inválido");
            return null;
        }
        
        //pega posição a ser removida e o nó anterior
        No atual = primeiroNo;
        No anterior = null;
        for(int i = 0; i < indice; i++) {
            anterior = atual;
            atual = atual.getProximoNo();
        }
        
        //se for a primeira posição
         if (indice == 0) {
            primeiroNo  = atual.getProximoNo();
        }
         //define o Nó anterior a posição atual para o próximo
         else {
            anterior.setProximoNo(atual.getProximoNo());
         }   
         
         //corrigir se o removido for o ultimo
         if (indice == tamanhoLista - 1) {
             ultimoNo = anterior;
         }
         tamanhoLista--;
        return atual.getInfo();
    }
    public Object get(int indice){
        //Recebe o índice iniciando em zero
        // e retorna o campo Info do Nó
        // correspondente.
        
        /*Irei criar um método que irá percorrer
        a lista, retornando o Nó correspondente
         ao indice solicitado.*/
        if(indice>=0 && indice < tamanhoLista)
            return percorreLista(indice).getInfo();
        else return null;
        
    }
    public String concatenaNos(){
        /*Retorna o Info de todos os Nós concatenados*/
        String concatena = "Lista de nos: \n";
        for (int i = 0; i < tamanhoLista; i++ ) {
            concatena += get(i) + "\n";
        }
        
        return concatena;
    }
    
    private No percorreLista(int indice) {
        
        No aux=primeiroNo;
        for(int i=0; i<indice;i++){
            aux=aux.getProximoNo();
        }
        return aux;
    }

    public int getTamanhoLista() {
        return tamanhoLista;
    }
    
    
    
}

