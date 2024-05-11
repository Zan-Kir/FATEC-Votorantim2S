
package Arvore;

public class NoBinario {
    private Object info;
    private NoBinario esquerdaNo;
    private NoBinario direitaNo;
    
    public NoBinario(Object info, NoBinario direitaNo, NoBinario esquerdaNo) {
        this.info = info;
        this.direitaNo = direitaNo;
        this.esquerdaNo = esquerdaNo;
    }

    public Object getInfo() {
        return info;
    }

    public NoBinario getDireitaNo() {
        return direitaNo;
    }
    
    public NoBinario getEsquerdaNo() {
        return esquerdaNo;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setDireitaNo(NoBinario direitaNo) {
        this.direitaNo = direitaNo;
    }
    
    public void setEsquerdaNo(NoBinario esquerdaNo) {
        this.esquerdaNo = esquerdaNo;
    }
    
}
