/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 7
 * Ivana Figueroa - 24785
 * 
 * Clase TestBST
 * Pruebas unitarias para la clase BST con productos
 */
import org.junit.*;
import java.util.Comparator;
import java.io.*;
import static org.junit.Assert.*;

public class TestBST {
    private BST<String, Product> bst;
    private ByteArrayOutputStream outContent;
    
    /**
     * Configuracion inicial para las pruebas.
     */
    @Before
    public void setUp() {
        bst = new BST<>(Comparator.<String>naturalOrder());
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        bst.insert("004", new Product("004", "Chamarra Cortaviento", "Camiseta ligera y transpirable para correr", "s:12|m:18|l:22|xl:15"));
        bst.insert("005", new Product("005", "Pantalón Deportivo", "Pantalón cómodo para entrenamiento", "xs:6|s:14|m:20|l:18|xl:12"));
        bst.insert("006", new Product("006", "Sudadera con Capucha", "Sudadera cálida para entrenamiento en clima frío", "s:10|m:20|l:25|xl:18"));
    }

     /**
     * Prueba del recorrido inorden.
     */
    @Test
    public void inOrderTest() {
        bst.inOrder();
        String salida = outContent.toString();
        
        assertTrue(salida.contains("004"));
        assertTrue(salida.contains("005"));
        assertTrue(salida.contains("005"));
        

    }

     /**
     * Prueba la bsuqueda de productos
     */
    @Test
    public void SearchTest() {
        Product encontrado = bst.Search("005");
        assertNotNull(encontrado);
        assertEquals("Pantalón Deportivo", encontrado.getNombre());
    }
}
    

