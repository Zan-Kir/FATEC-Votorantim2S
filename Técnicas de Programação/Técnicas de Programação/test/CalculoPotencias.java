
import Aula5.Matematica;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoPotencias {
    
    @Test
    public void testePotenciaDeDois() {
        Matematica mat = new Matematica();
        //Teste 2^0 = 1
        int base=2;
        int potencia=0;
        assertEquals(1, mat.pot(base, potencia));
        
        //Teste 2^1 = 2
        base=2;
        potencia=1;
        assertEquals(2, mat.pot(base, potencia));
        
        //Teste 2^2 = 4
        base=2;
        potencia=2;
        assertEquals(4, mat.pot(base, potencia));
        
        //Teste 2^3 = 8
        base=2;
        potencia=3;
        assertEquals(8, mat.pot(base, potencia));
    }
}
