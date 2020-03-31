import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DwarfTest {
    
    @Test
    public void dwarfNasceCom110DeVida(){
        Dwarf dwarf = new Dwarf("Mulungrid");
        assertEquals(110.0, dwarf.getVida(), 1e-9);
    }
    
    @Test
    public void dwarfPerde10DeVida(){
        Dwarf dwarf = new Dwarf("Mulungrid");
        dwarf.sofrerDano();
        assertEquals(100.0, dwarf.getVida(), 1e-9);
    }
    
    @Test
    public void dwarfPerdeTodaVida11Ataques(){
        Dwarf dwarf = new Dwarf("Mulungrid");
        
        for( int i = 0; i < 11; i++ ) {
            dwarf.sofrerDano();
        }
        
        assertEquals(0.0, dwarf.getVida(), 1e-9);
    }
    
    
    @Test
    public void dwarfPerdeTodaVida12Ataques(){
        Dwarf dwarf = new Dwarf("Mulungrid");
        
        for( int i = 0; i < 12; i++ ) {
            dwarf.sofrerDano();
        }
        
        assertEquals(0.0, dwarf.getVida(), 1e-9);
    }
    
    @Test
    public void dwarfNasceComStatus(){
        Dwarf dwarf = new Dwarf("Gimli");
        assertEquals( Status.RECEM_CRIADO, dwarf.getStatus() );
    }
    
    @Test
    public void dwarfPerdeVidaEContinuaVivo(){
        Dwarf dwarf = new Dwarf("Gimli");
        dwarf.sofrerDano();
        assertEquals( Status.SOFREU_DANO, dwarf.getStatus() );
    }
    
    @Test
    public void dwarfPerdeVidaEDeveMorrer(){
        Dwarf dwarf = new Dwarf("Mulungrid");
        
        for( int i = 0; i < 11; i++ ) {
            dwarf.sofrerDano();
        }
        
        assertEquals(Status.MORTO, dwarf.getStatus());
    }
    
    @Test
    public void dwarfNasceComEscudoNoInventario(){
        Dwarf dwarf = new Dwarf("Gimli");
        assertEquals("Escudo", dwarf.getInventario().buscar("Escudo").getDescricao());
    }
    
    @Test
    public void dwarfEquipaEscudoETomaMetadeDano(){
        Dwarf dwarf = new Dwarf("Gimli");
        dwarf.equiparEscudo();
        dwarf.sofrerDano();
        assertEquals(105.0, dwarf.getVida(), 1e-9);
    }
    
    @Test
    public void dwarfNaoEquipaEscudoETomaDanoIntegral(){
        Dwarf dwarf = new Dwarf("Gimli");
        dwarf.sofrerDano();
        assertEquals(100.0, dwarf.getVida(), 1e-9);
    }
    
}









