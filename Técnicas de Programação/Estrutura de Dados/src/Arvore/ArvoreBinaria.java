
package Arvore;

public class ArvoreBinaria {
    //Atributos
    private NoBinario raiz;
    
    public ArvoreBinaria(Object info) {
        raiz = new NoBinario(info, null, null);
    }
    public int buscar(int valor) {
        return buscar(valor, raiz, 0);
    }
    private int buscar(int valor, NoBinario no, int profundidade) {
        int resposta = -1;
        if((int)no.getInfo() == valor) {
            return profundidade;
        }
        else {
            //verifica se o nó da esquerda ou da direita não é nulo
            //se nao for nulo busca nesses nós
            if(valor < (int)no.getInfo() && no.getEsquerdaNo() != null) {
                resposta = buscar(valor, no.getEsquerdaNo(), profundidade++);
            }
            else if(no.getDireitaNo() != null) {
                resposta = buscar(valor, no.getDireitaNo(), profundidade++);
            }
            return resposta;
        }
    }
    public void addNoOrdenado(int valor, NoBinario no) {
        //se valor for menor que o valor do nó adiciona a esquerda
        //se nao adiciona a direita
        
        if (valor < (int)raiz.getInfo()) {
            if(no.getEsquerdaNo() == null) {
                no.setEsquerdaNo(new NoBinario(valor, null, null));
            } else {
                addNoOrdenado(valor, no.getEsquerdaNo());
            }
        } 
        else {
            if(no.getDireitaNo() == null) {
                no.setDireitaNo(new NoBinario(valor, null, null));
            } else {
                addNoOrdenado(valor, no.getDireitaNo());
            }
        }
    }
    public void imprimirArvore() {
        imprimirArvore(raiz);
    }
    private void imprimirArvore(NoBinario no) {
        System.out.println("No: " + no.getInfo());
        if(no.getEsquerdaNo() != null)
            imprimirArvore(no.getEsquerdaNo());
        if(no.getDireitaNo() != null)
            imprimirArvore(no.getDireitaNo());
    }
}
