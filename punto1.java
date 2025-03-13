package tallermatricesobj;

public class punto1 {
    public void P1(int dimension){
        Metodos objMetodos = new Metodos();
        objProducto [][] m ;
        m = objMetodos.LlenarMatriz(dimension);
        objMetodos.MostrarMatriz(m, dimension);
        
    }
    
}
