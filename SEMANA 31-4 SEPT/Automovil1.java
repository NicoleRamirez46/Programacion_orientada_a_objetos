package automovil;

class Automovil {
    String fabricante;
    String modelo;
    String color;
    double cilindraje;
    int capacidadEstanque;

    public Automovil(String fabricante, String modelo, String color, double cilindraje, int capacidadEstanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.capacidadEstanque = capacidadEstanque;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " esta acelerando a " + rpm + " revoluciones por minuto";
    }

    public String verDetalle() {
        return "Fabricante: " + this.fabricante
         + "Modelo: " + this.modelo
         + "Color: " + this.color
         + "Cilindraje: " + this.cilindraje
         + "Capacidad del estanque: " + this.capacidadEstanque;
    }

    public String frenar() {
    return "El auto " + this.fabricante + " esta frenando";
    }

    public String acelerarFrenar(int rpm) {
    return acelerar(rpm) + " " + frenar();
    }

    public float calcularConsumo(int km, float porcentajeGasolina) {
    float gasolina = this.capacidadEstanque * porcentajeGasolina;
    return km / gasolina;
    }

    public float calcularConsumo(int km, int porcentajeGasolina) {
    float porcentaje = porcentajeGasolina / 100.0f;
    return calcularConsumo(km, porcentaje);
    }
}
