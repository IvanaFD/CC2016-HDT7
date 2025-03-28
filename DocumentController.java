import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;


public class DocumentController {

    public final BST<String, Product> arbolPorSKU;
    public final BST<String, Product> arbolPorNombre;
    
    public DocumentController(){
        this.arbolPorSKU = new BST<>(Comparator.<String>naturalOrder());
        this.arbolPorNombre = new BST<>(Comparator.<String>naturalOrder());
    }
    
    //metodo utilizado en hoja de trabajo 6 para cargar datos del csv
    public void cargarDatos(String filename) throws IOException{


        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
              
                try {
                    String[] columna = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                
                    String SKU = columna[0].trim();
                    String nombre = columna[1].trim();
                    String descripcion = columna[3].trim();
                    String inventario = columna[2].trim();

                    Product producto = new Product(SKU,nombre, descripcion, inventario);

                    arbolPorSKU.insert(SKU,producto);
                    arbolPorNombre.insert(nombre.toLowerCase(), producto);
                    


                    

                    

                } catch (NumberFormatException e) {
                    System.out.println("Error en datos numericos: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error de lectura del CSV: " + e.getMessage());
        }

        
    }
}
