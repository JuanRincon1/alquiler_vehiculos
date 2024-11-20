package co.edu.umanizales.alquiler_vehiculos.controller;

import co.edu.umanizales.alquiler_vehiculos.model.Usuario;
import co.edu.umanizales.alquiler_vehiculos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Endpoint para registrar un nuevo usuario
    @PostMapping
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioService.registrarUsuario(usuario);
    }

    // Endpoint para validar el login de un usuario
    @PostMapping("/login")
    public Usuario validarUsuario(@RequestParam String login, @RequestParam String password) {
        return usuarioService.validarUsuario(login, password);
    }

    // Endpoint para listar todos los usuarios registrados
    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarioService.listarUsuarios();
    }
}
    

