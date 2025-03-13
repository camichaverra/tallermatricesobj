package tallermatricesobj;

public class punto5 {
    public void P5(int dimension){
        
        Metodos objMetodos = new Metodos();
        
        System.out.println("Llenamos la tienda 1");
        objProducto[][] tienda1 = objMetodos.LlenarMatriz(dimension);

        System.out.println("Llenamos la tienda 2");
        objProducto[][] tienda2 = objMetodos.LlenarMatriz(dimension);

        punto5meto objPunto5meto = new punto5meto();
        objProducto[][] tiendafusionada = objPunto5meto.fuTiendas(tienda1, tienda2, dimension);

        System.out.println("Tienda fusionada:");
        objMetodos.MostrarMatriz(tiendafusionada, dimension);

        
    }
    
}
