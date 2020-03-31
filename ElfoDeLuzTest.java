import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoDeLuzTest{
    @Test
    public void elfoDaLuzDevePerderVida() {
        ElfoDeLuz feanor = new ElfoDeLuz("Feanor");
        Dwarf gul = new Dwarf("Gul");
        feanor.atacarComEspada(gul);
        assertEquals(79, feanor.getVida(), 1e-9 );
        assertEquals(100, gul.getVida(), 1e-9 );
    }
    
    @Test
    public void elfoDaLuzDevePerderVidaEGanhar() {
        ElfoDeLuz feanor = new ElfoDeLuz("Feanor");
        Dwarf gul = new Dwarf("Gul");
        feanor.atacarComEspada(gul);
        feanor.atacarComEspada(gul);
        assertEquals(89, feanor.getVida(), 1e-9 );
        assertEquals(90, gul.getVida(), 1e-9 );
    }

}
