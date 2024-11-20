package co.edu.umanizales.alquiler_vehiculos.model;// Define el paquete donde se encuentra esta clase.

public class Usuario {// Clase que representa un usuario del sistema, con atributos básicos de identificación y autenticación.


    private String cedula;// Número de cédula o documento de identificación del usuario.

    private String nombre;// Nombre completo del usuario.
    private String login;// Nombre de usuario utilizado para iniciar sesión.

    private String password;// Contraseña asociada al usuario para autenticación.

    
    public Usuario(String cedula, String nombre, String login, String password) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.login = login;
        this.password = password;
    }// Constructor que inicializa los atributos `cedula`, `nombre`, `login` y `password`.


    
    public String getCedula() {// Devuelve la cédula del usuario.
        return cedula;
    }

    public void setCedula(String cedula) {// Modifica la cédula del usuario.
        this.cedula = cedula;
    }

    public String getNombre() {// Devuelve el nombre del usuario.
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }// Modifica el nombre del usuario.


    public String getLogin() {
        return login;
    }// Devuelve el nombre de usuario (login).

    public void setLogin(String login) {
        this.login = login;
    } // Modifica el nombre de usuario (login).


    public String getPassword() {
        return password;
    }// Devuelve la contraseña del usuario.


    public void setPassword(String password) {
        this.password = password;
    }// Modifica la contraseña del usuario.

}