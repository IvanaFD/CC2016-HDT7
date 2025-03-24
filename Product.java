public class Product {

    private String SKU;
    private String nombre;
    private String descripcion;
    private String inventario ;

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
        return "Producto{" + "SKU='" + SKU + '\'' + ", nombre='" + nombre + '\'' + "Descripcion: "+ descripcion+ ", inventario= " + inventario + '}';
    }

    
}

