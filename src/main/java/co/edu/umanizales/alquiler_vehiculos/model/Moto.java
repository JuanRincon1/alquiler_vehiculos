package co.edu.umanizales.alquiler_vehiculos.model;// Define el paquete donde se encuentra esta clase.

public class Moto extends Vehiculo {// Declara la clase `Moto`, que hereda de `Vehiculo`.
    private boolean casco;// Atributo que indica si la moto incluye casco.


    public Moto(String matricula, int km, boolean disponible, double valorAlquiler, boolean casco) {
        super(matricula, km, disponible, valorAlquiler);
        this.casco = casco;// Constructor que inicializa los atributos heredados y el atributo específico `casco`.
    }


    public boolean isCasco() {// Devuelve si la moto incluye casco.
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;// Modifica el valor de si la moto incluye casco.
    }

    @Override
    public double calcularAlquiler(int kmRecorridos) {// Sobrescribe el cálculo del alquiler específico para motos.
    
        return kmRecorridos * 0.05;
    }
}
    

