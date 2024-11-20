package co.edu.umanizales.alquiler_vehiculos.model;

public class Vehiculo {

    public String matricula;
    public int km;
    public boolean disponible;
    public double valorAlquiler; 

    public Vehiculo(String matricula, int km, boolean disponible, double valorAlquiler) {
        this.matricula = matricula;
        this.km = km;
        this.disponible = disponible;
        this.valorAlquiler = valorAlquiler;
    }
    
    public double calcularAlquiler(int km) {
        return km * valorAlquiler;
    };
}