package co.edu.umanizales.alquiler_vehiculos.model;// Define el paquete donde se encuentra esta clase.

public class Vehiculo {// Clase base que representa un vehículo genérico con atributos comunes.


    public String matricula;// Matrícula o número de placa del vehículo.

    public int km;// Kilómetros recorridos por el vehículo.

    public boolean disponible;// Indica si el vehículo está disponible para alquiler.
    public double valorAlquiler; // Valor base del alquiler por kilómetro.
    public String color;

    public Vehiculo(String matricula, int km, boolean disponible, double valorAlquiler, String color) {
        this.matricula = matricula;
        this.km = km;
        this.disponible = disponible;
        this.valorAlquiler = valorAlquiler;
        this.color = color;
    }// Constructor que inicializa los atributos `matricula`, `km`, `disponible` y `valorAlquiler`.
    
    public double calcularAlquiler(int km) {
        return km * valorAlquiler;
    };// Método para calcular el costo del alquiler en función de los kilómetros recorridos.
    // Multiplica los kilómetros por el valor base del alquiler.
}