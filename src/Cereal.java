public class Cereal {
    String nombre;
    double toneladas;

    public Cereal(String nombre, double toneladas) {
        this.nombre = nombre;
        this.toneladas = toneladas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }
}
