public class Barco {
    double capacidadMaxima;
    Cereal cerealGuardado;
    public Barco (double capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
        this.cerealGuardado=null;
    }
    public boolean cargarCereal (Camiones camionQuiereCargar) {
        double cantidadDeCereal = camionQuiereCargar.getCerealLlevado().getToneladas();
        if (cantidadDeCereal<=(this.capacidadMaxima)){
            this.cerealGuardado=camionQuiereCargar.getCerealLlevado();
            return true;
        }else return false;
    }
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Cereal getCerealGuardado() {
        return cerealGuardado;
    }

    public void setCerealGuardado(Cereal cerealGuardado) {
        this.cerealGuardado = cerealGuardado;
    }
}
