/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5;

/**
 *
 * @author muril
 */
public class NoDuplo {
    private Object info;
    private NoDuplo proximoNo;
    private NoDuplo anteriorNo;
    
    public NoDuplo(Object info, NoDuplo proximoNo, NoDuplo anteriorNo) {
        this.info=info;
        this.proximoNo=proximoNo;
        this.anteriorNo= anteriorNo;
    }


    public Object getInfo() {
        return info;
    }

    public NoDuplo getProximoNo() {
        return proximoNo;
    }
    
    public NoDuplo getAnteriorNo() {
        return anteriorNo;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximoNo(NoDuplo proximoNo) {
        this.proximoNo = proximoNo;
    }
    
    public void setAnteriorNo(NoDuplo anteriorNo) {
        this.anteriorNo = anteriorNo;
    }
    
}
