import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DwarfBarbaLongaTest {
    
    @Test
    public void tira3eSofreDano(){
        DadoFalso dado = new DadoFalso();
        dado.simularValor(3);
        DwarfBarbaLonga dwarf = new DwarfBarbaLonga("Gimli", dado);
        dwarf.sofrerDano();
        assertEquals( 100.0, dwarf.getVida(), 1e-9 );
    }
}
