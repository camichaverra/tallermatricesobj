package tallermatricesobj;

public class objAsiento {
    private int numero;
    private int fila;
    private double precio;
    public objAsiento(int numero, int fila, double precio) {
        this.numero = numero;
        this.fila = fila;
        this.precio = precio;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
