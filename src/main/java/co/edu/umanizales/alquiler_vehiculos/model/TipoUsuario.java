package co.edu.umanizales.alquiler_vehiculos.model;// Define el paquete donde se encuentra esta clase.

public class TipoUsuario {// Clase que representa el tipo de usuario, con un código y una descripción.
    private String codigo;// Código único que identifica el tipo de usuario.

    private String descripcion;// Descripción que detalla el tipo de usuario.
    
    public TipoUsuario(String codigo, String descripcion) {// Constructor que inicializa los atributos `codigo` y `descripcion`.
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    
    public String getCodigo() {// Devuelve el código del tipo de usuario.

        return codigo;
    }

    public void setCodigo(String codigo) {// Modifica el código del tipo de usuario.
        this.codigo = codigo;
    }

    public String getDescripcion() {// Devuelve la descripción del tipo de usuario.
        return descripcion;
    }

    public void setDescripcion(String descripcion) {// Modifica la descripción del tipo de usuario.
        this.descripcion = descripcion;
    }
}
    

