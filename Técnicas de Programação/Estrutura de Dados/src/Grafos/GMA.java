
package Grafos;

public class GMA {

    

    //Atributos

    private Integer matriz[][];
    private Object listaVertices[];
    private boolean grafoDirecional;
    private int indexVertice;
    public GMA(int qtdVertices, boolean grafoDirecional) {
        matriz = new Integer[qtdVertices] [qtdVertices];
        listaVertices = new Object[qtdVertices];
        this.grafoDirecional = grafoDirecional;
        indexVertice = 0;
    }
    public void adicionarVertices(Object vertice){
        if(indexVertice < listaVertices.length){
            listaVertices[indexVertice] = vertice;
            indexVertice++;
        }
        else 
            System.out.println("Tamanho máximo atingido");
    }
    public void removerVertices(Object vertice){
        int iVertice =buscaVertice(vertice);
        if(iVertice != -1){
            //remove o vertice da lista
            listaVertices[iVertice]=null;
            //remove da matriz
            for(int iDestino=0; iDestino<matriz.length;iDestino++){
                matriz[iVertice][iDestino] = null;
                matriz[iDestino][iVertice] = null;
            }
        }
        
    }
        
    public void adicionarAresta(Object origem, Object destino) {
        //atribuir valor zero ao peso
        this.adicionarAresta(origem, destino, 0);
    }
    
    public void adicionarAresta(Object origem, Object destino, int peso) {
        int iOrigem, iDestino;
        iOrigem = buscaVertice(origem);
        iDestino = buscaVertice(destino);
        if(grafoDirecional){
            matriz[iOrigem][iDestino] = peso;
            matriz[iDestino][iOrigem] = peso;
        }
        else{ //Grafo não é direcional
            matriz[iOrigem][iDestino] = peso;
        }
    }
    
    public int buscaVertice(Object vertice){
        int index = 0;
        for(Object aux: listaVertices) {
            if(aux.equals(vertice)){
                return index;
            }
            index++;
        }
        return -1;
    }
    
    public void imprimirMatrizAdj() {
        //imprime a matriz de adjacencias utilizando sout
        // |   Vertice   |   0   |   1   |   2   |
        // |      0      |       |       |       |
        // |      1      |       |       |       |
        // |      2      |       |       |       |
        
    }
    
    public Integer[][] getMatriz() {
        return matriz;
    }

    public Object[] getListaVertices() {
        return listaVertices;
    }

    public boolean isGrafoDirecional() {
        return grafoDirecional;
    }
    
    public void setMatriz(Integer[][] matriz) {
        this.matriz = matriz;
    }

    public void setListaVertices(Object[] listaVertices) {
        this.listaVertices = listaVertices;
    }
    
    public void setGrafoDirecional(boolean grafoDirecional) {
        this.grafoDirecional = grafoDirecional;
    }
}
