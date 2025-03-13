package tallermatricesobj;
import java.util.Scanner;


public class Metodos {

    public objProducto [][] LlenarMatriz (int dimension) {
        objProducto [][] m = new objProducto [dimension][dimension];
        for (int i = 0; i < dimension; i++)
         { for (int j = 0; j < dimension; j++) {
               objProducto o = new objProducto();
               Scanner sc = new Scanner(System.in);
               System.out.println("Ingrese el nombre del producto: ");
               o.setNombre(sc.next()); 
               System.out.println("Ingrese el precio del producto: ");
               o.setPrecio(sc.nextDouble());
               System.out.println("Ingrese la cantidad del producto: ");
               o.setCantidad(sc.nextInt());
               m[i][j] = o;
            }
        }
        return m;
    }
    
    public void MostrarMatriz(objProducto [][] m, int dimension) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Cantidad: " + m[i][j].getCantidad());
            }
        }
    }
    public void buscarProducto(objProducto[][] m ,int dimension,String nombreBuscado){
        boolean encontrado=false;

        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                if(m[i][j].getNombre().equals(nombreBuscado)){
                    System.out.println("Producto encontrado en la posicion:[" + i +"][" + j + "]");;
                    encontrado=true;
                    return;
                }
            }

        }
        if(!encontrado){
            System.out.println("Producto no encontrado");
        }
    }
    public int calcularInventarioTotal(objProducto[][] m ,int dimension){
        int total=0;
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                total+=m[i][j].getCantidad();
            }
        }
        return total;
   
    }
    public void LibroMasCaro(objLibro[][] matriz ,int dimension){
        objLibro libroMascaro  = null;
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                if(libroMascaro== null|| matriz[i][j].getPrecio()>libroMascaro.getPrecio()){
                    libroMascaro=  matriz[0][0];
        
                }
            }
        }
        if(libroMascaro != null){
            System.out.println("El libro mas caro es:");
            System.out.println("titulo: "+libroMascaro.getTitulo());
            System.out.println("autor: "+libroMascaro.getAutor());
            System.out.println("precio: "+libroMascaro.getPrecio());
}else{
    System.out.println("No hay libros en la tienda");
   }
     }
     public void OrdenarAsientos(objAsiento[][] matriz, int dimension){
        
        for(int i=0;i<dimension;i++){
            for(int j =0; j<dimension-1;j++){
                for(int k=0;k<dimension-j-1;k++){
                    if (matriz[i][k].getPrecio()>matriz[i][k+1].getPrecio()){
                        objAsiento temp = matriz[i][k];
                        matriz[i][k]=matriz[i][k+1];
                        matriz[i][k+1]=temp;
                    }
                }
            }
        }
        System.out.println("Los asientos han sido ordenados por precio dentro de cada fila ");
     }
     public void mostrarMatrizAsientos(objAsiento[][] matriz, int dimension){
        for(int i=0;i<dimension;i++){
            System.out.println("Fila "+(i+1)+":");
            for(int j=0;j<dimension;j++){
                System.out.println("Numero:"+matriz[i][j].getNumero()+
                                    " Precio:"+matriz[i][j].getPrecio());
               
            }
        }
       
        }
        public objProducto[][] FiltrarProductosDisponibles(objProducto[][] matriz, int dimension) {
           
            objProducto[][] nuevaMatriz = new objProducto[dimension][dimension];

            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    
                    if (matriz[i][j] != null && matriz[i][j].isDisponible()) {
                        
                        nuevaMatriz[i][j] = matriz[i][j];
                    }
                }
            }
            
            return nuevaMatriz;
        }
        public void MostrarrMatriz(objProducto[][] matriz, int dimension) {
            // Recorremos la matriz
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    // Verificamos que la celda no esté vacía
                    if (matriz[i][j] != null) {
                        System.out.println("Producto en [" + i + "][" + j + "]: " +
                                           "Nombre: " + matriz[i][j].getNombre() + ", " +
                                           "Precio: $" + matriz[i][j].getPrecio() + ", " +
                                           "Disponible: " + (matriz[i][j].isDisponible() ? "Sí" : "No"));
                    } else {
                        System.out.println("Producto en [" + i + "][" + j + "]: Vacío");
                    }
                }
            }
        }
    
   
    // Método para llenar la matriz de ventas y nombres de vendedores
    public void llenarVentas(double[][] ventas, String[] nombres) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del vendedor " + (i + 1) + ": ");
            nombres[i] = sc.next();

            for (int j = 0; j < 12; j++) {
                System.out.print("Ingrese las ventas de " + nombres[i] + " en mes " + (j + 1) + ": ");
                ventas[i][j] = sc.nextDouble();
            }
        }
    }

    // Método para encontrar el mejor vendedor y mostrar los resultados
    public void mejorVendedor(double[][] ventas, String[] nombres) {
        double mejorVenta = 0;
        String mejorVendedor = "";

        for (int i = 0; i < 5; i++) {
            double totalVentas = 0;

            for (int j = 0; j < 12; j++) {
                totalVentas += ventas[i][j]; // Sumar ventas del año
            }

            if (totalVentas > mejorVenta) {
                mejorVenta = totalVentas;
                mejorVendedor = nombres[i];
            }
        }

        // 🔹 Mostrar el resultado
        System.out.println("\n🏆 El mejor vendedor del año es: " + mejorVendedor);
        System.out.println("Total de ventas: $" + mejorVenta);
    }



    // Método para llenar la matriz de productos
    public void llenarMatriz(objProducto10 [][] matriz) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el nombre del producto [" + i + "][" + j + "]: ");
                String nombre = sc.next();

                System.out.print("Ingrese el precio del producto: ");
                double precio = sc.nextDouble();

                System.out.print("¿El producto está en oferta? (true/false): ");
                boolean enOferta = sc.nextBoolean();

                matriz[i][j] = new objProducto(nombre, precio, enOferta);
            }
        }
    }

    // Método para contar cuántos productos están en oferta
    public int contarEnOferta(objProducto10 [][] matriz) {
        int totalEnOferta = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].isEnOferta()) {
                    totalEnOferta++;
                }
            }
        }

        return totalEnOferta;
    }
}



    // Método para clasificar a los estudiantes según su calificación
    public void clasificarEstudiantes(objEstudiante[][] matriz, objEstudiante[][] grupoA, objEstudiante[][] grupoB, objEstudiante[][] grupoC) {
        int filaA = 0, filaB = 0, filaC = 0;

        for (int i = 0; i < matriz.length; i++) {
            int colA = 0, colB = 0, colC = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                objEstudiante estudiante = matriz[i][j];

                if (estudiante.getCalificacion() >= 90) {
                    grupoA[filaA][colA++] = estudiante;
                } else if (estudiante.getCalificacion() >= 70) {
                    grupoB[filaB][colB++] = estudiante;
                } else {
                    grupoC[filaC][colC++] = estudiante;
                }
            }

            if (colA > 0) filaA++;
            if (colB > 0) filaB++;
            if (colC > 0) filaC++;
        }
    }

    // Método para mostrar los estudiantes de una matriz dada
    public void mostrarGrupo(String titulo, objEstudiante[][] grupo) {
        System.out.println("\n" + titulo);
        for (int i = 0; i < grupo.length; i++) {
            for (int j = 0; j < grupo[i].length; j++) {
                if (grupo[i][j] != null) {
                    System.out.println("Nombre: " + grupo[i][j].getNombre() + " - Calificación: " + grupo[i][j].getCalificacion());
                }
            }
        }
    }



  
       