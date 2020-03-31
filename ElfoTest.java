import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoTest{
    
    @After
    public void tearDown(){
        System.gc();
    } 
    
    @Test
    public void atirarFlechaDiminuirFlechaAumentarXP(){
        Elfo novoElfo = new Elfo("Legolas");
        Dwarf novoDwarf = new Dwarf("Gimli");
        novoElfo.atirarFlecha(novoDwarf);
        assertEquals(1, novoElfo.getExperiencia());
        assertEquals(1, novoElfo.getQtdFlecha());
    }
    
    @Test
    public void atirar2FlechasZerarFlechas2xAumentarXP(){
        Elfo novoElfo = new Elfo("Legolas");
        Dwarf novoDwarf = new Dwarf("Gimli");
        novoElfo.atirarFlecha(novoDwarf);
        novoElfo.atirarFlecha(novoDwarf);
        assertEquals(2, novoElfo.getExperiencia());
        assertEquals(0, novoElfo.getQtdFlecha());
    }
    
    @Test
    public void atirar3FlechasZerarFlechas2xAumentarXP(){
        Elfo novoElfo = new Elfo("Legolas");
        Dwarf novoDwarf = new Dwarf("Gimli");
        novoElfo.atirarFlecha(novoDwarf);
        novoElfo.atirarFlecha(novoDwarf);
        novoElfo.atirarFlecha(novoDwarf);
        assertEquals(2, novoElfo.getExperiencia());
        assertEquals(0, novoElfo.getQtdFlecha());
    }
    
    @Test
    public void elfoNasceComStatusRecemCriado(){
        Elfo novoElfo = new Elfo("Legolas");
        assertEquals(Status.RECEM_CRIADO, novoElfo.getStatus());
    }
    
    @Test
    public void naoCriaElfoNaoIncrementa(){
        assertEquals(0, Elfo.getQtdElfos());
    }
    
    @Test
    public void cria1ElfoContadorUmaVez(){
        Elfo novoElfo = new Elfo("Legolas");
        assertEquals(1, Elfo.getQtdElfos());
    }
    
    @Test
    public void cria2ElfoContadorDuasVezes(){
        Elfo novoElfo = new Elfo("Legolas");
        Elfo novoElfo1 = new Elfo("Legolas");
        assertEquals(2, Elfo.getQtdElfos());
    }
    
    
    
    
    
    
    
    
    
    
}
