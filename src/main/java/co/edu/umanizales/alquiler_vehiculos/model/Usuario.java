package co.edu.umanizales.alquiler_vehiculos.model;

public class Usuario {

    private String cedula;
    private String nombre;
    private String login;
    private String password;

    // Constructor
    public Usuario(String cedula, String nombre, String login, String password) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.login = login;
        this.password = password;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}