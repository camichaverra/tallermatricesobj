package tallermatricesobj;

public class punto2 {
    public void P2(int dimension){
        Metodos objMetodos = new Metodos();

        objProducto [][] m = new objProducto[dimension][dimension];

        m = objMetodos.LlenarMatriz(dimension);

        objMetodos.MostrarMatriz(m, dimension);
        int inventarioTotal=objMetodos.calcularInventarioTotal(m, dimension);

        System.out.println("El inventario total de la tienda es: "+inventarioTotal);
        }

    }
    

