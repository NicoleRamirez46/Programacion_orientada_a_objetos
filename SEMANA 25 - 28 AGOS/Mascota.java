package Mascota; // Indica el paquete al que pertenece la clase.

public class Mascota { // Crea la clase llamada Mascota.

    String nombre; // Declara el atributo nombre de tipo String.
    String especie; // Declara el atributo especie de tipo String.
    int edad; // Declara el atributo edad de tipo entero.

    // Constructor de la clase Mascota.
    public Mascota(String nombre, String especie, int edad) {

        this.nombre = nombre; // Guarda el nombre recibido en el atributo nombre.
        this.especie = especie; // Guarda la especie recibida en el atributo especie.
        this.edad = edad; // Guarda la edad recibida en el atributo edad.
    }

    // Método que muestra la información de la mascota.
    public void mostrarInfo () {

        System.out.println("Nombre: " + nombre); // Muestra el nombre de la mascota.
        System.out.println("Especie: " + especie); // Muestra la especie de la mascota.
        System.out.println("Edad: " + edad); // Muestra la edad de la mascota.
    }
}
