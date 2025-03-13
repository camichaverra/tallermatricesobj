package tallermatricesobj;

public class punto7 {
    
    public void P7(objProducto[][] matriz, int dimension) {
        Metodos objMetodos = new Metodos();
       
        objProducto[][] productosDisponibles = objMetodos.FiltrarProductosDisponibles(matriz, dimension);

        
        Metodos objMostrar = new Metodos();
        objMostrar.MostrarrMatriz(productosDisponibles, dimension);
    }
    
}





