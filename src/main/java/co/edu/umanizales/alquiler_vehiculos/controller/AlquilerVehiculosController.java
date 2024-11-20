package co.edu.umanizales.alquiler_vehiculos.controller;

import co.edu.umanizales.alquiler_vehiculos.model.Vehiculo;
import co.edu.umanizales.alquiler_vehiculos.service.AlquilerVehiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/vehiculos")
public class AlquilerVehiculosController {
    @Autowired
    private AlquilerVehiculosService vehiculoService;

    @GetMapping("/disponibles")
    public List<Vehiculo> obtenerVehiculosDisponibles() {
        return vehiculoService.obtenerVehiculosDisponibles();
    }

    @PostMapping("/registrar")
    public Vehiculo registrarVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.registrarVehiculo(vehiculo);
    }
}
