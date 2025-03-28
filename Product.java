/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 7
 * Ivana Figueroa - 24785
 * 
 * Clase Product
 * Representa un producto en el inventario de la tienda.
 * Contiene informacion basica como SKU, nombre, descripción e inventario.
 */

public class Product {

    private String SKU;
    private String nombre;
    private String descripcion;
    private String inventario ;

    /**
     * Constructor para crear un nuevo producto.
     * @param SKU Código unico del producto
     * @param nombre Nombre del producto
     * @param descripcion Descripción detallada
     * @param inventario Cadena con cantidades por talla
     */

    public Product(String SKU, String nombre, String inventario, String descripcion) {
        this.SKU = SKU;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inventario = inventario;

    }

    public String getSKU(){
        return SKU;
    }

    public String getNombre(){
        return nombre;
    }

    public String getInventario(){
        return inventario;
    }

    public String getDescripcion(){
        return descripcion;
    }

    @Override
    public String toString() {
        return "Producto  {" + "SKU=" + SKU +" - " + " nombre=" + nombre + " - " + " Descripcion: "+ descripcion+ " - " +" inventario= " + inventario + '}';
    }

    
}

