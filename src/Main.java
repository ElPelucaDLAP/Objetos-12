import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Puerto puertoSUS = new Puerto();
        //nuevos cereales
        Cereal c1 = new Cereal("Trigo",22.5);
        Cereal c2 = new Cereal("Maiz", 42.5);
        Cereal c3 = new Cereal("Cebada",15.7);
        Cereal c4 = new Cereal("Arroz",18.2);
        Cereal c5 = new Cereal("Avena",70.7);
        //nuevos camiones
        Camiones camion1 = new Camiones("Volsvagen","1",c1, LocalDate.parse("2025-05-11"));
        Camiones camion2 = new Camiones("Toyota","2",c2,LocalDate.parse("2025-05-10"));
        Camiones camion3 = new Camiones("Fiat","3",c3,LocalDate.parse("2025-05-13"));
        Camiones camion4 = new Camiones("Peugeot","4",c4,LocalDate.parse("2025-05-14"));
        Camiones camion5 = new Camiones("Renault","5",c5,LocalDate.parse("2025-05-08"));
        //nuevos barcos
        Barco barco1 = new Barco(23.9);
        Barco barco2 = new Barco(47.15);
        Barco barco3 = new Barco(14.2);
        Barco barco4 = new Barco(19.2);
        Barco barco5 = new Barco(77.2);
        Barco barco6 = new Barco(20.2);
        //Cargar en el puerto
        puertoSUS.anadirCamion(camion1);
        puertoSUS.anadirCamion(camion2);
        puertoSUS.anadirCamion(camion3);
        puertoSUS.anadirCamion(camion4);
        puertoSUS.anadirCamion(camion5);
        puertoSUS.anadirBarco(barco1);
        puertoSUS.anadirBarco(barco2);
        puertoSUS.anadirBarco(barco3);
        puertoSUS.anadirBarco(barco4);
        puertoSUS.anadirBarco(barco5);
        puertoSUS.anadirBarco(barco6);
    }
}