package co.edu.umanizales.alquiler_vehiculos.service;

import co.edu.umanizales.alquiler_vehiculos.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private final List<Usuario> usuarios = new ArrayList<>();

    // Método para registrar un nuevo usuario
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para validar el login de un usuario
    public Usuario validarUsuario(String login, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null; // Si no se encuentra el usuario, devuelve null
    }

    // Método para listar todos los usuarios registrados
    public List<Usuario> listarUsuarios() {
        return this.usuarios;
    }
}

