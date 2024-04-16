/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5;

/**
 *
 * @author muril
 */
public class ListaDuplamenteLigada {
    NoDuplo primeiroNo;
    NoDuplo ultimoNo;
    int tamanhoLista;
    
    public ListaDuplamenteLigada(){
        tamanhoLista=0;
        primeiroNo = ultimoNo = null;
    }
    
    public void adicionar(Object elemento){
        //Adiciona um nó na ultima posição.
        //Para o 1º Nó
        NoDuplo novo = new NoDuplo(elemento, null, null);
            
        if(primeiroNo==null && ultimoNo==null){
            primeiroNo = ultimoNo = novo;
            tamanhoLista++;
        }
        else{// Para os demais nós
            ultimoNo.setProximoNo(novo); //o proximo do ultimo aponta para o novo
            novo.setAnteriorNo(ultimoNo);// o anterior do novo aponta para o ultimo
            tamanhoLista++;
        }
    }
    public void adicionar(Object elemento, int indice){
        /*Método deverá adicionar o elemento na posição
        indicada pelo indice */
        
        //checa se a posição é válida
        if (indice > tamanhoLista || indice < 0){
            System.out.println("Erro indice inválido");
            return;
        }

        //cria um novo Nó
        NoDuplo novo = new NoDuplo(elemento, null, null);
        
        //define se é o Primeiro Nó
        if (indice == 0) {
            novo.setProximoNo(primeiroNo);
            novo.setAnteriorNo(null);
            primeiroNo = novo;
        }
        
        //define em outra posição
        else {
            NoDuplo anterior = percorreLista(indice -1);
            //indice -1 pra achar o nó anterior que é onde sera inserido
            
            //checa se o  nó é válido
            if (anterior == null) {
                System.out.println("Erro: índice inválido");
                return;
            }
            
            novo.setProximoNo(anterior.getProximoNo()); //esse faz o novo apontar pro proximo
            novo.setAnteriorNo(anterior); // faz o novo apontar para o nó anterior
            
            //checa se não é a ultima posição  para fazer o proximo apontar para o novo
            if (anterior.getProximoNo() != null) {
                anterior.getProximoNo().setAnteriorNo(novo); //faz o ex nó atual apontar pro novo
            }
            anterior.setProximoNo(novo); //faz o nó anterior apontar pro novo
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
        if (indice >= tamanhoLista || indice < 0){
            System.out.println("Erro indice inválido");
            return null;
        }
        
        NoDuplo atual;
        
        
        //pega posição a ser removida e o nó anterior
        //atual = percorreLista(indice);
       
        //se for a primeira posição
         if (indice == 0) {
             atual = primeiroNo;
             primeiroNo  = atual.getProximoNo(); //o segundo nó é atribuido ao primeiro nó
             primeiroNo.setAnteriorNo(null); //define o anterior como null, pois é a primeira posição
        }
         //define o Nó anterior a posição atual para o próximo
         else {
             NoDuplo anterior = percorreLista(indice -1);
             atual = anterior.getProximoNo();
             anterior.setProximoNo(atual.getProximoNo());
             
             if(atual.getProximoNo() != null){
                 (atual.getProximoNo()).setAnteriorNo(anterior);
                 // define o nó anterior do próximo nó do atual como o anterior a ele
                //(proximo do atual . definir  nó anterior (anterior)
                //resumindo faz o proximo nó apontar para o anterior (exclui o atual)
             }
             else {  //se for o último
                 ultimoNo = anterior;
                 ultimoNo.setProximoNo(null);
             }
         }
         
         tamanhoLista--;
        return atual.getInfo();
    }
    
    public Object getLista(int indice){
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
    public String imprimirLista(){
        /*Retorna o Info de todos os Nós concatenados*/
        String concatena = "Lista de nos: \n";
        for (int i = 0; i < tamanhoLista; i++ ) {
            concatena += getLista(i) + "\n";
        }
        
        return concatena;
    }
    
    private NoDuplo percorreLista(int indice) {
        
        NoDuplo aux=primeiroNo;
        for(int i=0; i<indice;i++){
            aux=aux.getProximoNo();
        }
        return aux;
    }

    public int getTamanhoLista() {
        return tamanhoLista;
    }  

    public void adicionaOrdenado(int valor, TipoOrdenacao tipo) {
        
        /*if (tamanhoLista == 0) {
            primeiroNo = ultimoNo = null;
        }
        */
        
        if (tipo == TipoOrdenacao.CRESCENTE) {
            
            if (tamanhoLista == 0 || valor <= (int) primeiroNo.getInfo()) {
                adicionar(valor, 0); // define se for o primeiro elemento da lista
                return;
            }
            
            NoDuplo atual = primeiroNo; //inicia o atual no começo
            int indice = 0; //contador de posicao
            while (atual.getProximoNo() != null && (int) atual.getProximoNo().getInfo() < valor) {
                // enquanto o atual nao for o ultimo E o valor(info) do atual for < que o valor
                atual = atual.getProximoNo();
                indice++;
            }
            adicionar(valor, indice +1);            
        }
        
        if (tipo == TipoOrdenacao.DESCRESCENTE) {
            if (tamanhoLista == 0 || valor >= (int) primeiroNo.getInfo()) {
                adicionar(valor, 0);
                return;
            }
            
            NoDuplo atual = primeiroNo;
            int indice = 0;
            while(atual.getProximoNo() != null && (int) atual.getProximoNo().getInfo() > valor) {
                atual = atual.getProximoNo();
                indice++;
            }
            adicionar(valor, indice +1);
        }
        System.out.println(this.imprimirLista());
    }
}