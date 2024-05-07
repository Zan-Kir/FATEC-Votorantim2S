
package escola;

public class TestePessoa {
    
    public static void main(String[] args) {
        Funcionario p = new Funcionario("Pedro",20,Genero.MASCULINO.toString());
        System.out.println("Nome: " + p.getNome());
        
        Aluno pedro = new Fundamental("Pedro",8,Genero.MASCULINO.toString());
        pedro.setNota(7);
        System.out.println("NOME: " + pedro.getNome());
        
        pedro = new Colegio("Pedro",20,Genero.MASCULINO.toString());
    }
}
