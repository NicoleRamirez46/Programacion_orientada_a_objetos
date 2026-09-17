package estudiante; // Indica el paquete al que pertenece la clase.

public class Libro { // Crea la clase llamada Libro.

    String titulo; // Declara el atributo titulo de tipo String.
    String autor; // Declara el atributo autor de tipo String.
    int numeroPaginas; // Declara el atributo numeroPaginas de tipo entero.

    // Este es el CONSTRUCTOR de la clase Libro
    public Libro(String titulo, String autor, int numeroPaginas) {

        this.titulo = titulo; // Guarda el título recibido en el atributo titulo.
        this.autor = autor; // Guarda el autor recibido en el atributo autor.
        this.numeroPaginas = numeroPaginas; // Guarda el número de páginas recibido.
    }

    // METODO que muestra la información del libro.
    public void mostrarInfo() {

        System.out.println("Título: " + titulo); // Muestra el título del libro.
        System.out.println("Autor: " + autor); // Muestra el autor del libro.
        System.out.println("Número de páginas: " + numeroPaginas); // Muestra las páginas.
    }
}
