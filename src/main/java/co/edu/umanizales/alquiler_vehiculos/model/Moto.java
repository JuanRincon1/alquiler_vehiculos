package co.edu.umanizales.alquiler_vehiculos.model;

public class Moto extends Vehiculo {
    private boolean casco;

    public Moto(String matricula, int km, boolean disponible, double valorAlquiler, boolean casco) {
        super(matricula, km, disponible, valorAlquiler);
        this.casco = casco;
    }

    // Getters y setters
    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    @Override
    public double calcularAlquiler(int kmRecorridos) {
        return kmRecorridos * 0.05;
    }
}
    

