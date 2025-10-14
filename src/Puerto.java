import java.util.ArrayList;

public class Puerto {
    ArrayList<Camiones> camionesEnEspera;
    ArrayList<Barco> barcosEnEspera;
    public Puerto (){
        this.barcosEnEspera=new ArrayList<>();
        this.camionesEnEspera=new ArrayList<>();
    }
    public void anadirBarco (Barco barcoNuevo){
        barcosEnEspera.add(barcoNuevo);
    }
    public void anadirCamion(Camiones camionesNuevo){
        camionesEnEspera.add(camionesNuevo);
    }
    public ArrayList<Camiones> getCamionesEnEspera() {
        return camionesEnEspera;
    }

    public void setCamionesEnEspera(ArrayList<Camiones> camionesEnEspera) {
        this.camionesEnEspera = camionesEnEspera;
    }

    public ArrayList<Barco> getBarcosEnEspera() {
        return barcosEnEspera;
    }

    public void setBarcosEnEspera(ArrayList<Barco> barcosEnEspera) {
        this.barcosEnEspera = barcosEnEspera;
    }
}
