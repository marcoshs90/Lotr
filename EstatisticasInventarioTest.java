import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EstatisticasInventarioTest {
    
    @Test
    public void calcularMediaInventarioVazio(){
        Inventario inventario = new Inventario(1);
        EstatisticasInventario estatisticas = new EstatisticasInventario(inventario);
        assertTrue(Double.isNaN(estatisticas.calcularMedia()));
    }
    
    @Test
    public void calcularMediaApenasUmItem(){
        Inventario inventario = new Inventario(1);
        inventario.adicionar(new Item(2, "Escudo"));
        EstatisticasInventario estatisticas = new EstatisticasInventario(inventario);
        assertEquals(2, estatisticas.calcularMedia(), 1e-9);
    }
    
    @Test
    public void calcularMediaComDoisItem(){
        Inventario inventario = new Inventario(1);
        inventario.adicionar(new Item(2, "Escudo"));
        inventario.adicionar(new Item(4, "Espada"));
        EstatisticasInventario estatisticas = new EstatisticasInventario(inventario);
        assertEquals(3, estatisticas.calcularMedia(), 1e-9);
    }
    
    
    
    
    
    
}