package co.edu.umanizales.alquiler_vehiculos.service;// Define el paquete donde se encuentra esta clase.


import co.edu.umanizales.alquiler_vehiculos.model.Vehiculo;// Importa la clase `Vehiculo` que representa un vehículo genérico.
import org.springframework.stereotype.Service;// Importa la anotación `@Service`, que marca esta clase como un componente de servicio en Spring.
import java.util.ArrayList;
import java.util.List;
// Importa las clases `ArrayList` y `List` para gestionar colecciones de vehículos.

@Service// Anotación que indica que esta clase es un servicio de negocio en el contexto de Spring.

public class AlquilerVehiculosService {// Clase que contiene la lógica de negocio relacionada con el alquiler de vehículos.
    private List<Vehiculo> vehiculos = new ArrayList<>();// Lista que almacena todos los vehículos registrados en el sistema.

    public List<Vehiculo> obtenerVehiculosDisponibles() {
        List<Vehiculo> disponibles = new ArrayList<>();// Lista temporal para almacenar los vehículos disponibles.
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.disponible) {
                disponibles.add(vehiculo);// Itera sobre la lista de vehículos y agrega a `disponibles` aquellos que estén marcados como disponibles.
            }
        }
        return disponibles;// Devuelve la lista de vehículos disponibles.

    }

    public Vehiculo registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);// Agrega un nuevo vehículo a la lista `vehiculos`.

        return vehiculo;// Registra un vehículo en el sistema y devuelve el vehículo agregado.
    }

    
}
