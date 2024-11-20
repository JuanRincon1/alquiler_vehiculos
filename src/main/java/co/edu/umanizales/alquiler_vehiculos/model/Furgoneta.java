package co.edu.umanizales.alquiler_vehiculos.model;

public class Furgoneta extends Vehiculo {
    private short capacidad;

    public Furgoneta(String matricula, int km, boolean disponible, double valorAlquiler, short capacidad) {
        super(matricula, km, disponible, valorAlquiler);
        this.capacidad = capacidad;
    }

    public short getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(short capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public double calcularAlquiler(int kmRecorridos) {
        return kmRecorridos * 0.15;
    }

    // Getters y setters
}

