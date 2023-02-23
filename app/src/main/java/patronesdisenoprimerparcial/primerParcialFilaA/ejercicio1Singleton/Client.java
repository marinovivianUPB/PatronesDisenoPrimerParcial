package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio1Singleton;


public class Client {
    public static void main(String[] args) {
        Vehiculo a = new Vehiculo("AK46", "Revolver12", "Marengo");
        Vehiculo b = new Vehiculo("AK65", "Adidas29", "Azul Marino");
        Vehiculo c = new Vehiculo("FJ67", "Nissan14", "Rojo");
        Vehiculo d = new Vehiculo("RR44", "BMW12", "Azul");
        Vehiculo e = new Vehiculo("UP57", "Rockefeller15", "Naranja");
        Vehiculo f = new Vehiculo("RA71", "Casio12", "Verde");

        Cabina.getInstance().addVehiculo(a);
        Cabina.getInstance().addVehiculo(b);
        Cabina.getInstance().addVehiculo(c);
        Cabina.getInstance().addVehiculo(d);
        Cabina.getInstance().addVehiculo(e);
        Cabina.getInstance().addVehiculo(f);

        //SE MUESTRA AUTOMATICAMENTE CUANDO YA SE TIENEN 6 VEHICULOS
    }
}
