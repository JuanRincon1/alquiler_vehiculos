package co.edu.umanizales.alquiler_vehiculos.model;

public class Coche extends Vehiculo {
    private boolean extras;

    // Constructor
    public Coche(String matricula, int km, boolean disponible, double valorAlquiler, boolean extras) {
        super(matricula, km, disponible, valorAlquiler); // Llama al constructor de Vehiculo
        this.extras = extras;
    }

    @Override
    public double calcularAlquiler(int kmRecorridos) {
        return kmRecorridos * 0.10; // Lógica de cálculo específica para coches
    }

    // Getters y setters
    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }
    
}
