package automov1l;

public class Automov1l {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;
    int capacidadEstanque;

    public Automov1l(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    public String verDetalle() {
        return "Fabricante: " + this.fabricante
        + " Modelo: " + this.modelo
        + " Color: " + this.color
        + " Cilindrada: " + this.cilindrada
        + " Capacidad del estanque: " + this.capacidadEstanque;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante
        + " esta acelerando a " + rpm
        + " revoluciones por minuto";
    }

    public String frenar() {
    return "El auto " + this.fabricante + " esta frenando";
    }

    public String acelerarFrenar(int rpm) {
    return acelerar(rpm) + " " + frenar();
    }
}
