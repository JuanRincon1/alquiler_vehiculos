package co.edu.umanizales.alquiler_vehiculos.controller; // Define el paquete donde se encuentra esta clase, en este caso dentro de la carpeta 'controller'
// del proyecto 'alquiler_vehiculos'.

import co.edu.umanizales.alquiler_vehiculos.model.Vehiculo;// Importa la clase `Vehiculo`, que es el modelo que se gestionará en este controlador.

import co.edu.umanizales.alquiler_vehiculos.service.AlquilerVehiculosService;// Importa el servicio `AlquilerVehiculosService`, que contiene la lógica de negocio para
// gestionar los vehículos.
import org.springframework.beans.factory.annotation.Autowired;// Importa la anotación `@Autowired` para inyectar automáticamente dependencias en esta clase.

import org.springframework.web.bind.annotation.*;// Importa las anotaciones de Spring MVC para definir endpoints REST.

import java.util.List;// Importa la clase `List` para manejar colecciones de vehículos.


@RestController// Marca esta clase como un controlador REST, indicando que gestionará solicitudes HTTP y retornará
// las respuestas directamente en formato JSON o similar.
@RequestMapping("/vehiculos")// Define la URL base para todos los endpoints de esta clase. En este caso, todas las rutas 
// comenzarán con `/vehiculos`.
public class AlquilerVehiculosController {// Declara la clase `AlquilerVehiculosController`, que actúa como controlador para gestionar
    // las operaciones relacionadas con vehículos.
    
    @Autowired
    private AlquilerVehiculosService vehiculoService;// Inyecta automáticamente una instancia de `AlquilerVehiculosService` en esta clase.
    // Este servicio contiene la lógica de negocio relacionada con el alquiler de vehículos.

    @GetMapping("/disponibles")// Define un endpoint que responde a solicitudes HTTP GET en la ruta `/vehiculos/disponibles`.
    public List<Vehiculo> obtenerVehiculosDisponibles() {// Método para obtener una lista de vehículos disponibles. 
        // Retorna una lista de objetos `Vehiculo`.
        return vehiculoService.obtenerVehiculosDisponibles();// Llama al método `obtenerVehiculosDisponibles` del servicio, que contiene
        // la lógica para filtrar y retornar los vehículos disponibles.
    }

    @PostMapping("/registrar")// Define un endpoint que responde a solicitudes HTTP POST en la ruta `/vehiculos/registrar`.
    public Vehiculo registrarVehiculo(@RequestBody Vehiculo vehiculo) {// Método para registrar un nuevo vehículo. El objeto `Vehiculo` es recibido en el cuerpo 
        // de la solicitud como JSON y se convierte automáticamente a una instancia de la clase `Vehiculo`.
        return vehiculoService.registrarVehiculo(vehiculo);// Llama al método `registrarVehiculo` del servicio para guardar el nuevo vehículo
        // en el sistema y retorna el objeto registrado.
    }
}