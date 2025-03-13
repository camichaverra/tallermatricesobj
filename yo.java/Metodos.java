public class Metodos {
    public objProducto[][] organizarPorCategoria(objProducto[][] productos) {
        int filas = productos.length;
        int columnas = productos[0].length;

        objProducto[][] estanterias = new objProducto[filas][columnas];

        for (int i = 0; i < filas; i++) {
            int posicion = 0;
            for (int j = 0; j < columnas; j++) {
                if (productos[i][j] != null) {
                    estanterias[i][posicion] = productos[i][j];
                    posicion++;
                }
            }
        }

        return estanterias;
    }

    public void mostrarMatriz(objProducto[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null) {
                    System.out.print(matriz[i][j].getNombre() + " (" + matriz[i][j].getCategoria() + ") | ");
                } else {
                    System.out.print("Vacío | ");
                }
            }
            System.out.println();
        }
    }
}


