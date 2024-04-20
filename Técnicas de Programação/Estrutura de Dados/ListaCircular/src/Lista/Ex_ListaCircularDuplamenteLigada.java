
package Lista;

import Lista.NoDuplo;

public class Ex_ListaCircularDuplamenteLigada {
    
    //Atributos da Lista
    private int qtdNos ;
    private NoDuplo primeiroNo;
    
    
    public Ex_ListaCircularDuplamenteLigada(){
        qtdNos=0;
        primeiroNo=null;        
    }
    
    //Método que realiza a adição de um novo elemento no final da lista
    public void adicionar(Object item){
         NoDuplo novoNo;
        //Se a lista está vazia, cria o primeiro item da lista e atribui ao primeiroNo
        if(primeiroNo==null){
            novoNo=new NoDuplo(null, null, item);
            novoNo.setProximo(novoNo);
            novoNo.setAnterior(novoNo);
            primeiroNo=novoNo;
            qtdNos++;
        }
        else{
            //Se a lista não está vazia, adiciona na ultima posição da lista
            novoNo=new NoDuplo(primeiroNo, primeiroNo.getAnterior(), item);
            primeiroNo.getAnterior().setProximo(novoNo);
            primeiroNo.setAnterior(novoNo);
            qtdNos++;
        }
        
    }
     public void adicionar(Object item, int indice){
        if (indice > qtdNos || indice < 0){
            System.out.println("Erro indice inválido");
            return;
        }
        
        NoDuplo novo = new NoDuplo(null, null, item);
        if (indice == 0) {
            if (primeiroNo != null) {
                novo.setProximo(primeiroNo);
                novo.setAnterior(primeiroNo.getAnterior());
                primeiroNo.setAnterior(novo);
                primeiroNo = novo;
            } else {
                primeiroNo = novo;
                primeiroNo.setAnterior(novo);
                primeiroNo.setProximo(novo);
            }
        }
        else {
            NoDuplo anterior = percorreLista(indice -1);
            //indice -1 pra achar o nó anterior que é onde sera inserido
            
            novo.setProximo(anterior.getProximo()); //esse faz o novo apontar pro proximo
            novo.setAnterior(anterior); // faz o novo apontar para o nó anterior

            ( anterior.getProximo() ).setAnterior(novo); //faz o ex nó atual apontar pro novo
            anterior.setProximo(novo); //faz o nó anterior apontar pro novo
        }
        
        //acrescenta no total da lista
         qtdNos++;
            
    }
     
     public void remover(int indice){
        //checa se a posição é válida
        if (indice >= qtdNos || indice < 0){
            System.out.println("Erro indice inválido");
            return;
        }
        NoDuplo removido; // é o nó a ser removido
       
        //se for a primeira posição
         if (indice == 0) {
             removido= primeiroNo;
             if (qtdNos == 1) {
                 primeiroNo = null;
             }
             else {
                primeiroNo  = removido.getProximo(); //o segundo nó é atribuido como primeiro nó
                primeiroNo.setAnterior(removido.getAnterior()); //define o anterior como anterior do removido
                ( removido.getAnterior() ).setProximo(primeiroNo); //faz o ultimo apontar pro novo primeiro
             }
        }
         //define o Nó anterior a posição atual para o próximo
         else {
             NoDuplo anterior = percorreLista(indice -1);
             removido = anterior.getProximo(); //acha o nó a ser removido
             anterior.setProximo( removido.getProximo() ); //faz o no anterior apontar para o proximo do atual
             
             if (indice == qtdNos -1) { // ultimo no
                 primeiroNo.setAnterior(anterior); //faz o primeiro no apontar para o anterior do removido
             } else {
                ( removido.getProximo() ).setAnterior(anterior); //faz o proximo do removido apontar para o anterior 
             }
         }
         qtdNos--;
    }
    
    public String imprimirLista(){
       return imprimirLista("Inicio>>", primeiroNo, 0);
   }
    public String imprimirLista(String resposta, NoDuplo auxiliar, int contador){
        //condicoes de saida, lista vazia ou contador fora do limite
        if (auxiliar == null || contador == qtdNos) {
            return resposta;
        }
        
        resposta += auxiliar.getInfo().toString() + " \n"; //concatena a info e converte em string
        
        return imprimirLista(resposta, auxiliar.getProximo(), contador + 1); //retorna uma chamada recursiva
    }
   
    /*public String imprimirLista(String resposta, NoDuplo auxiliar, int contador){
        // Retorna as INFO de todos os Nos concatenados em uma string
        // O método deve ser recusivo.
        
        resposta+= " " + auxiliar.getInfo().toString();
        if(contador< qtdNos-1)//Condicional de Parada
            return null;//** Adicione aqui a chamada recursiva **
        else
            return null;//** Adicione aqui a resposta do condicional de parada **        
    } */
    
    public Object getLista(int indice){
        return percorreLista(indice).getInfo();
    }
    
    private NoDuplo percorreLista(int indice){
        //Se o indice for negativo percorre no sentido anti horario
        // Se o indice for positivo percorre no sentido horario
        // Se o índice for zero retorna o primeiroNo
        NoDuplo noAux=primeiroNo;
        
        if(indice>0){
            for(int i=0; i<indice;i++){
               noAux =  noAux.getProximo();
            }
        }
        else if(indice<0){
            for(int i=indice; i<0;i++){
               noAux =  noAux.getAnterior();
            }
        }
        return noAux;
    }
    
   public int tamanho(){
        return qtdNos;
    }
     
    
   
    
}
