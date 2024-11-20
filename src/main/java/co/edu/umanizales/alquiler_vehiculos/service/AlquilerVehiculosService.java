package co.edu.umanizales.alquiler_vehiculos.service;

import co.edu.umanizales.alquiler_vehiculos.model.Vehiculo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlquilerVehiculosService {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public List<Vehiculo> obtenerVehiculosDisponibles() {
        List<Vehiculo> disponibles = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.disponible) {
                disponibles.add(vehiculo);
            }
        }
        return disponibles;
    }

    public Vehiculo registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        return vehiculo;
    }

    // Métodos para editar, eliminar, activar/desactivar
}
