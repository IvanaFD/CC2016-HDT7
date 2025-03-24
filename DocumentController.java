
/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 7
 * Ivana Figueroa - 24785
 * 
 * Clase DcumentController
 * carga los datos del CSV y guardar los Productos
 */

import java.io.*;
import java.util.*;


public class DocumentController{

    
   
    public static Map<String, Product> cargarDatosPorSku(String filename)throws IOException{
        Map<String, Product> data = new TreeMap<>();
       

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
              
                try {
                    String[] columna = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                

                    
                    String SKU = columna[0].trim();
                    String nombre = columna[1].trim();
                    String descripcion = columna[2].trim();
                    String inventario = columna[3].trim();

                    Product producto = new Product(SKU,nombre, descripcion, inventario);
                    


                    

                    

                } catch (NumberFormatException e) {
                    System.out.println("Error en datos numericos: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error de lectura del CSV: " + e.getMessage());
        }

        System.out.println("Total de productos cargados: " + data.size());
        return data;
    }

    
}
