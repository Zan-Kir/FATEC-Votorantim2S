
package escola;

public class Aluno extends Pessoa {
    float nota;
    public Aluno(String nome, String genero){
    super(nome,genero);
    }
    
    public Aluno(String nome,int idade, String genero){
        super(nome,idade,genero);
    }
    
    public void setNota(float nota){
        this.nota=nota;
    }
    
   public float getNota(){
       return this.nota;
   }

    @Override
    public String getNome() {
        return super.nome;
    }
}
