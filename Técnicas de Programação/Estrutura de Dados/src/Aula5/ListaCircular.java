/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5;

/**
 *
 * @author muril
 */
public class ListaCircular {
     NoDuplo primeiroNo;
    int tamanhoLista;
    
    public ListaCircular(){
        tamanhoLista=0;
        primeiroNo = null;
    }
    
    public void adicionar(Object elemento){
        //Adiciona um nó na ultima posição.
        //Para o 1º Nó
        NoDuplo novo = new NoDuplo(elemento, null, null);
            
        if(primeiroNo==null){ // se a lista estiver vazia
            primeiroNo = novo; //define o primeiro no como o novo
            primeiroNo.setProximoNo(novo); //faz o primeiro no apontar para ele msm (novo)
            primeiroNo.setAnteriorNo(novo);
            tamanhoLista++;
        }
        else{// Para os demais nós
            novo.setProximoNo(primeiroNo); //se ele vai ser inserido no final da lista o prox é o primeiro
            novo.setAnteriorNo(primeiroNo.getAnteriorNo()); //define o no anterior como o anterior do primeiro (até aqui o ultimo da lista)
            ( primeiroNo.getAnteriorNo() ).setProximoNo(novo); //faz o anterior ao primeiro(ultimo) apontar o novo como prox
            primeiroNo.setAnteriorNo(novo); //faz o primeiro no apontar o novo como ultimo finalmente
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
            if (primeiroNo != null) {
                novo.setProximoNo(primeiroNo);
                novo.setAnteriorNo(primeiroNo.getAnteriorNo());
                primeiroNo.setAnteriorNo(novo);
                primeiroNo = novo;
            } else {
                primeiroNo = novo;
                primeiroNo.setAnteriorNo(novo);
                primeiroNo.setProximoNo(novo);
            }
        }
        
        //define em outra posição
        else {
            NoDuplo anterior = percorreLista(indice -1);
            //indice -1 pra achar o nó anterior que é onde sera inserido
            
            novo.setProximoNo(anterior.getProximoNo()); //esse faz o novo apontar pro proximo
            novo.setAnteriorNo(anterior); // faz o novo apontar para o nó anterior

            ( anterior.getProximoNo() ).setAnteriorNo(novo); //faz o ex nó atual apontar pro novo
            anterior.setProximoNo(novo); //faz o nó anterior apontar pro novo
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
        
        NoDuplo removido; // é o nó a ser removido
       
        //se for a primeira posição
         if (indice == 0) {
             removido= primeiroNo;
             if (tamanhoLista == 1) {
                 primeiroNo = null;
             }
             else {
                primeiroNo  = removido.getProximoNo(); //o segundo nó é atribuido como primeiro nó
                primeiroNo.setAnteriorNo(removido.getAnteriorNo()); //define o anterior como anterior do removido
                ( removido.getAnteriorNo() ).setProximoNo(primeiroNo); //faz o ultimo apontar pro novo primeiro
             }
        }
         //define o Nó anterior a posição atual para o próximo
         else {
             NoDuplo anterior = percorreLista(indice -1);
             removido = anterior.getProximoNo(); //acha o nó a ser removido
             anterior.setProximoNo( removido.getProximoNo() ); //faz o no anterior apontar para o proximo do atual
             
             if (indice == tamanhoLista -1) { // ultimo no
                 primeiroNo.setAnteriorNo(anterior); //faz o primeiro no apontar para o anterior do removido
             } else {
                ( removido.getProximoNo() ).setAnteriorNo(anterior); //faz o proximo do removido apontar para o anterior 
             }
         }
         tamanhoLista--;
        return removido.getInfo();
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
    
    public String imprimirLista(String resposta, NoDuplo auxiliar, int contador){
        //condicoes de saida, lista vazia ou contador fora do limite
        if (auxiliar == null || contador == tamanhoLista) {
            return resposta;
        }
        
        resposta += auxiliar.getInfo().toString() + " \n"; //concatena a info e converte em string
        
        return imprimirLista(resposta, auxiliar.getProximoNo(), contador + 1); //retorna uma chamada recursiva
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
}
