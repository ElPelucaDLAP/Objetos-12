import java.time.LocalDate;

public class Camiones {
    String marca;
    String patente;
    Cereal cerealLlevado;
    LocalDate fechaDeCarga;

    public Camiones(String marca, String patente, Cereal cerealLlevado, LocalDate fechaDeCarga) {
        this.marca = marca;
        this.patente = patente;
        this.cerealLlevado = cerealLlevado;
        this.fechaDeCarga=fechaDeCarga;
    }

    public LocalDate getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(LocalDate fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Cereal getCerealLlevado() {
        return cerealLlevado;
    }

    public void setCerealLlevado(Cereal cerealLlevado) {
        this.cerealLlevado = cerealLlevado;
    }
}
