
package escola;

public class Fundamental extends Aluno {
    
    public Fundamental(String nome, String genero){
    super(nome,genero);
    }
    
    public Fundamental(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }
    
    
    
    /*
    public String getNota(){
        if(super.nota<5 && super.nota>=0){
            return "D";
        }else if(super.nota<6){
            return "C";
        }else if(super.nota<8){
            return "B";
        }else if(super.nota<10){
            return "A";
        }
        return"Nota inválidade";
    }*/
    
}
