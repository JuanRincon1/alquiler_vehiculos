package co.edu.umanizales.alquiler_vehiculos.service;// Define el paquete donde se encuentra esta clase.

import co.edu.umanizales.alquiler_vehiculos.model.Usuario;// Importa la clase `Usuario`, que representa a un usuario del sistema.
import org.springframework.stereotype.Service;// Importa la anotación `@Service`, que marca esta clase como un componente de servicio en Spring.
import java.util.ArrayList;
import java.util.List;
// Importa las clases `ArrayList` y `List` para gestionar colecciones de usuarios.

@Service// Anotación que indica que esta clase es un servicio de negocio en el contexto de Spring.

public class UsuarioService {// Clase que contiene la lógica de negocio relacionada con la gestión de usuarios.


    private final List<Usuario> usuarios = new ArrayList<>();// Lista que almacena los usuarios registrados en el sistema.


    
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }// Agrega un nuevo usuario a la lista usuarios.

    // Método para validar el login de un usuario
    public Usuario validarUsuario(String login, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null; // Si no se encuentra el usuario con las credenciales proporcionadas, devuelve null.
    }

    // Método para listar todos los usuarios registrados
    public List<Usuario> listarUsuarios() {
        return this.usuarios;
    }// Devuelve la lista de todos los usuarios registrados en el sistema.

}

