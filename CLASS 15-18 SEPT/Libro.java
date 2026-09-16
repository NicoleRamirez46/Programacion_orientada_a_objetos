public class Libro {
     private String titulo;
     private String autor;
     private String genero;
     private int numPaginas;
     
    public Libro() {
    }

    
    public Libro(String titulo, String autor, String genero, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }
    
    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
  
    public String verDetalle() {
        String detalle = " El nombre del libro es : " + this.titulo;
        detalle= detalle + "\n" + "El autor del libro es : " + this.autor;
        detalle= detalle + "\n" + "El genero del libro es : " + this.genero;
        detalle= detalle +"\n" +  "El numero de paginas es : " + this.numPaginas;
        return detalle;
    }
 
    public String prestar(String nombrePersona) {
        String mensaje = "El libro \"" + this.titulo + "\" ";
        mensaje = mensaje + "fue prestado a " + nombrePersona + ".";
        return mensaje;
    }
 
    public String devolver() {
        return "El libro \"" + this.titulo + "\" fue devuelto.";
    }

    public String prestarYDevolver(String nombrePersona) {
        String mensajePrestamo = this.prestar(nombrePersona);
        String mensajeDevolucion = this.devolver();
        return mensajePrestamo + "\n" + mensajeDevolucion;
    }
 
    public float calcularTiempoLectura(int paginasPorDia, float horasDisponibles) {
        float diasNecesarios = (float) this.numPaginas / paginasPorDia;
        return diasNecesarios;
    }
 
    
    public float calcularTiempoLectura(int paginasPorDia, int horasDisponibles) {
        float horasDecimal = (float) horasDisponibles;
        return this.calcularTiempoLectura(paginasPorDia, horasDecimal);
    }
}


    

