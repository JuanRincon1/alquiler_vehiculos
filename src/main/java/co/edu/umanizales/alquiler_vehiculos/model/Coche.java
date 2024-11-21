package co.edu.umanizales.alquiler_vehiculos.model; // Define el paquete donde se encuentra la clase. En este caso, pertenece al paquete 'model' 
// dentro de 'co.edu.umanizales.alquiler_vehiculos'.

public class Coche extends Vehiculo {// Declara la clase `Coche`, que extiende la clase base `Vehiculo`, es decir, 
    // hereda los atributos y métodos de `Vehiculo`.
    private boolean extras; // Declara un atributo privado `extras` de tipo booleano, que indica 
    // si el coche tiene extras adicionales (por ejemplo, aire acondicionado, GPS, etc.).


    
    public Coche(String matricula, int km, boolean disponible, double valorAlquiler, String color, boolean extras) {// Constructor de la clase `Coche`, que inicializa tanto los atributos heredados 
        // de `Vehiculo` como el atributo `extras`.
        super(matricula, km, disponible, valorAlquiler, color); // Llama al constructor de la clase base `Vehiculo` para inicializar los 
        // atributos heredados (`matricula`, `km`, `disponible`, y `valorAlquiler`).
        this.extras = extras;// Inicializa el atributo `extras` con el valor recibido como parámetro
    }

    @Override
    public double calcularAlquiler(int kmRecorridos) {// Sobrescribe el método `calcularAlquiler` definido en la clase base `Vehiculo`. 
        // Este método calcula el costo del alquiler según la distancia recorrida.
        return kmRecorridos * 0.10; // Retorna el costo del alquiler como el producto de los kilómetros recorridos 
        // por 0.10 (un valor fijo en este caso).
    }

    
    public boolean isExtras() {// Método getter que retorna el valor del atributo `extras`.
        return extras; // Devuelve el valor del atributo `extras`.
    }

    public void setExtras(boolean extras) {// Método setter que permite asignar un valor al atributo `extras`.
        this.extras = extras;// Asigna el valor recibido como parámetro al atributo `extras`.
    }
    
}
