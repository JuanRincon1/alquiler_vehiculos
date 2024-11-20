package co.edu.umanizales.alquiler_vehiculos;// Define el paquete donde se encuentra la clase principal de la aplicación.

import org.springframework.boot.SpringApplication;// Importa la clase `SpringApplication`, que se usa para lanzar la aplicación Spring Boot.
import org.springframework.boot.autoconfigure.SpringBootApplication;// Importa la anotación `@SpringBootApplication`, que marca la clase principal de la aplicación Spring Boot.

@SpringBootApplication// Anotación que indica que esta es la clase de inicio de la aplicación Spring Boot.
// Combina las siguientes anotaciones: @Configuration, @EnableAutoConfiguration y @ComponentScan.

public class AlquilerVehiculosApplication {// Clase principal de la aplicación que contiene el método `main`.
    public static void main(String[] args) {
        SpringApplication.run(AlquilerVehiculosApplication.class, args);
    }// Llama a `SpringApplication.run()`, que lanza la aplicación Spring Boot.
        // Le pasa la clase `AlquilerVehiculosApplication` como argumento para configurar el contexto de la aplicación.
}