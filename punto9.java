public class punto9 {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        double[][] ventas = new double[5][12];
        String[] nombres = new String[5];

        // Llamamos a los métodos
        metodos.llenarVentas(ventas, nombres);
        metodos.mejorVendedor(ventas, nombres);
    }
}

    

