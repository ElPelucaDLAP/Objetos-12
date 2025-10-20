import java.util.ArrayList;

public class Puerto {
    ArrayList<Camiones> camionesEnEspera;
    ArrayList<Barco> barcosEnEspera;
    public Puerto (){
        this.barcosEnEspera=new ArrayList<>();
        this.camionesEnEspera=new ArrayList<>();
    }
    public void cargarBarcos (){
        for (int i = 0; i<camionesEnEspera.size(); i++){
            int j = 0;
            boolean camionDescargado = false;
            while (j<barcosEnEspera.size() && !camionDescargado){
                if (barcosEnEspera.get(j).cargarCereal(camionesEnEspera.get(i))){
                    System.out.println("CamionDescargado");
                    barcosEnEspera.remove(j);
                    camionDescargado=true;
                }else j++;
            }
        }
    }
    //Ordena los barcos segun su capacidad maxima
    public void anadirBarco (Barco barcoNuevo){
        boolean barcoAsignado=false;
        if (barcosEnEspera.isEmpty()){
            barcosEnEspera.add(barcoNuevo);
        }else {
            barcoAsignado=false;
            int i = 0;
            while (!barcoAsignado && i<barcosEnEspera.size()){
                Double capacidadNuevo = barcoNuevo.getCapacidadMaxima();
                Double capacidadEnEspera = barcosEnEspera.get(i).getCapacidadMaxima();
                if (capacidadNuevo.compareTo(capacidadEnEspera)>0) {
                    barcosEnEspera.add(i,barcoNuevo);
                    barcoAsignado=true;
                }
                i++;
            }
            if (!barcoAsignado) {
                barcosEnEspera.add(barcoNuevo);
        }

    }}
    //Ordena los camiones segun la fcha
    public void anadirCamion(Camiones camionesNuevo){
        boolean camionAsignado = false;
        if (camionesEnEspera.isEmpty()){
            camionesEnEspera.add(camionesNuevo);
        }else {
            camionAsignado = false;
            int i = 0;
            while (!camionAsignado && i<camionesEnEspera.size()){
                if (camionesNuevo.getFechaDeCarga().isBefore(camionesEnEspera.get(i).getFechaDeCarga())){
                    camionesEnEspera.add(i,camionesNuevo);
                    camionAsignado=true;
                }
                i++;
            }
        }
        if (!camionAsignado) {
            camionesEnEspera.add(camionesNuevo);
        }
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
