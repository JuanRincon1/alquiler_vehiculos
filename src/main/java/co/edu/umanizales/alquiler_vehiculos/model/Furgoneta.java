package co.edu.umanizales.alquiler_vehiculos.model;// Define el paquete donde se encuentra esta clase.

public class Furgoneta extends Vehiculo {// Declara la clase `Furgoneta`, que hereda de `Vehiculo`.
    private short capacidad;// Atributo que representa la capacidad de carga de la furgoneta.

    public Furgoneta(String matricula, int km, boolean disponible, double valorAlquiler, String color, short capacidad) {// Constructor que inicializa los atributos heredados y específicos.
        super(matricula, km, disponible, valorAlquiler, color);
        this.capacidad = capacidad;
    }

    public short getCapacidad() {// Devuelve el valor de la capacidad.
        return capacidad;
    }

    public void setCapacidad(short capacidad) {// Modifica el valor de la capacidad.
        this.capacidad = capacidad;
    }

    @Override
    public double calcularAlquiler(int kmRecorridos) {// Sobrescribe el cálculo del alquiler específico para furgonetas.
        return kmRecorridos * 0.15;
    }

    
}

