public class Product {

    private String SKU;
    private String nombre;
    private String inventario ;

    public Product(String SKU, String nombre, String inventario) {
        this.SKU = SKU;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Producto{" + "SKU='" + SKU + '\'' + ", nombre='" + nombre + '\'' + ", inventario= " + inventario + '}';
    }

    
}

