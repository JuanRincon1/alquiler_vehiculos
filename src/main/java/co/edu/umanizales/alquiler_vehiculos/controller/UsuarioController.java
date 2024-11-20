package co.edu.umanizales.alquiler_vehiculos.controller;// Define el paquete donde se encuentra esta clase, en este caso dentro de 'controller' 
// del proyecto 'alquiler_vehiculos'.

import co.edu.umanizales.alquiler_vehiculos.model.Usuario;// Importa la clase `Usuario`, que representa el modelo de usuario en el sistema.

import co.edu.umanizales.alquiler_vehiculos.service.UsuarioService;// Importa el servicio `UsuarioService`, que contiene la lógica de negocio relacionada 
// con la gestión de usuarios.

import org.springframework.beans.factory.annotation.Autowired;// Importa la anotación `@Autowired` para inyectar automáticamente dependencias en la clase.
import org.springframework.web.bind.annotation.*;// Importa las anotaciones de Spring MVC para definir endpoints REST.


import java.util.List;// Importa la clase `List` para manejar colecciones de usuarios.

@RestController// Marca esta clase como un controlador REST, indicando que procesará solicitudes HTTP 
// y enviará respuestas en formato JSON o similar.
@RequestMapping("/usuarios")// Define la URL base para los endpoints de esta clase. Todos los endpoints comenzarán con `/usuarios`.

public class UsuarioController {// Declara la clase `UsuarioController`, que se encarga de gestionar las operaciones relacionadas con los usuarios.

    @Autowired
    private UsuarioService usuarioService;// Inyecta automáticamente una instancia de `UsuarioService`. 
    // Este servicio contiene la lógica de negocio para manejar usuarios

    
    @PostMapping// Define un endpoint que responde a solicitudes HTTP POST en la ruta `/usuarios`.
    public void registrarUsuario(@RequestBody Usuario usuario) {// Método para registrar un nuevo usuario. 
        // Recibe un objeto `Usuario` en el cuerpo de la solicitud en formato JSON.
        usuarioService.registrarUsuario(usuario);// Llama al método `registrarUsuario` del servicio para guardar el nuevo usuario en el sistema.
    }

    
    @PostMapping("/login")// Define un endpoint que responde a solicitudes HTTP POST en la ruta `/usuarios/login`.
    public Usuario validarUsuario(@RequestParam String login, @RequestParam String password) {// Método para validar las credenciales de un usuario.
        // Recibe el `login` y el `password` como parámetros de la solicitud (Query Parameters).
        return usuarioService.validarUsuario(login, password);// Llama al método `validarUsuario` del servicio, que verifica las credenciales
        // y retorna el usuario si es válido.
    }

    
    @GetMapping// Define un endpoint que responde a solicitudes HTTP GET en la ruta `/usuarios`.

    public List<Usuario> getUsuarios() {// Método para obtener una lista de todos los usuarios registrados en el sistema.
        // Retorna una lista de objetos `Usuario`.
        return usuarioService.listarUsuarios();// Llama al método `listarUsuarios` del servicio para obtener y retornar la lista de usuarios.
    }
}
    

