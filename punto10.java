
public class punto10 {

   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Ingrese el tamaño de la matriz (n x n): ");
            int n = sc.nextInt();
    
            objProducto[][] matriz = new objProducto[n][n];
            Metodos metodos = new Metodos();
    
            metodos.llenarMatriz(matriz);
            int totalOfertas = metodos.contarEnOferta(matriz);
            
            System.out.println("\n Total de productos en oferta: " + totalOfertas);
        }
    }
    



