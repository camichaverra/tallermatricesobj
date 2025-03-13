
   
   import java.util.Scanner;
   
   public class Punto8 {
       public void P8() {
           Scanner sc = new Scanner(System.in);
           Metodos objMetodos = new Metodos();
   
           System.out.print("Ingrese el número de filas: ");
           int filas = sc.nextInt();
           System.out.print("Ingrese el número de columnas: ");
           int columnas = sc.nextInt();
   
           objProducto[][] productos = new objProducto[filas][columnas];
   
           for (int i = 0; i < filas; i++) {
               for (int j = 0; j < columnas; j++) {
                   System.out.print("Ingrese el nombre del producto en [" + i + "][" + j + "]: ");
                   String nombre = sc.next();
                   System.out.print("Ingrese el peso del producto: ");
                   double peso = sc.nextDouble();
                   System.out.print("Ingrese la categoría del producto: ");
                   String categoria = sc.next();
   
                   productos[i][j] = new objProducto(nombre, peso, categoria);
               }
           }
   
           objProducto[][] estanterias = objMetodos.organizarPorCategoria(productos);
           objMetodos.mostrarMatriz(estanterias);
       }
   }
    
    
