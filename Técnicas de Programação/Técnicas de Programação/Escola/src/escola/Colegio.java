
package escola;

public class Colegio extends Aluno implements SalaVirtual {
    
    public Colegio(String nome, String genero) {
        super(nome, genero);
    }
    public Colegio(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }
    
    @Override
    public float getNota(){
        return super.nota;
    }
    
    @Override 
    public String login() {
        return "Login realizado com sucesso";
    }
    
    @Override
    public String logout() {
        return "Logout realizado com sucesso";
    }
}
