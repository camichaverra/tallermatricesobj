package tallermatricesobj;

public class punto5meto {
    public objProducto[][] fuTiendas(objProducto[][] tienda1, objProducto[][] tienda2, int dimension) {
        objProducto[][] resultado = new objProducto[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                objProducto prod1 = tienda1[i][j];
                objProducto prod2 = tienda2[i][j];

                if (prod1 != null && prod2 != null && prod1.getNombre().equals(prod2.getNombre())) {
                    resultado[i][j] = new objProducto(prod1.getNombre(), prod1.getPrecio() + prod2.getPrecio(), prod1.getCantidad() + prod2.getCantidad());
                } else if (prod1 != null) {
                    resultado[i][j] = new objProducto(prod1.getNombre(), prod1.getPrecio(), prod1.getCantidad());
                } else if (prod2 != null) {
                    resultado[i][j] = new objProducto(prod2.getNombre(), prod2.getPrecio(), prod2.getCantidad());
                }
            }
        }
        return resultado;
    }
    
}
