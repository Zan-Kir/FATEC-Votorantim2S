
package PersistenciaDados;

import java.io.IOException;
import java.util.logging.Logger;

public class testeMotocicleta {
    public static void main(String[] args) {
        Motocicleta motoca = new Motocicleta("Honda", "CG 150", 100);
        Motocicleta motoca2=null;
        System.out.println("Velocidade Atual: " + motoca.getVelocidade());
        try {
            Serializador.gravar("motoca.dat", motoca);
        } catch (IOException ex) {
            System.out.println("Erro ler: " + ex.getMessage());
        }
        motoca.alterarVelocidade(1.5f);
        System.out.println("Velocidade Atual: " + motoca.getVelocidade());
        try {
         motoca2 = (Motocicleta) Serializador.ler("motoca.dat");
        } catch (Exception ex) {
            System.out.println("Erro ler: " + ex.getMessage());
        }
        System.out.println("Motoca 2: " + motoca2.getVelocidade());
    }
}
