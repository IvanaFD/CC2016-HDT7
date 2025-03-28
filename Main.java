/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 7
 * Ivana Figueroa - 24785
 * 
 * Clase Main
 * Permite la interaccion con el usario
 */


import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        DocumentController controller = new DocumentController();

        try {
            controller.cargarDatos("Inventario30.csv");
            System.out.println("Data cargada");
        }catch(IOException e){
            System.err.println("Error con la carga del archivo: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n <<<<<<<<<Menu de inventario>>>>>>>>>");
            System.out.println("1. Buscar producto por SKU");
            System.out.println("2. Buscar producto por nombre");
            System.out.println("3. Mostrar producto por orden de SKU");
            System.out.println("4. Mostrar prodductor por orden de nombre");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese SKU: ");
                    String sku = scanner.nextLine();
                    Product productoSKU = controller.arbolPorSKU.Search(sku);
                    if (productoSKU != null) {
                        System.out.println("Producto encontrado: " + productoSKU);
                    }else{
                        System.out.println("Producto no encontrado");
                    }
                    
                    break;
                    
                   
                case 2:

                System.out.print("Ingrese SKU: ");
                String nombre = scanner.nextLine();
                Product productoN = controller.arbolPorNombre.Search(nombre);
                if (productoN != null) {
                    System.out.println("Producto encontrado: " + productoN);
                }else{
                    System.out.println("Producto no encontrado");
                }
                
                break;
                    

                case 3:
                    controller.arbolPorSKU.inOrder();
                    break;
                    
                   
                case 4:
                    controller.arbolPorNombre.inOrder();
                    break;
                case 5:
                    System.out.println("Adios");
                    scanner.close();
                    return;

            
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
        