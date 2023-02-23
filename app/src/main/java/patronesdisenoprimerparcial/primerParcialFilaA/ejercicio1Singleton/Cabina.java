package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio1Singleton;

import java.util.Stack;

public class Cabina {
    private Stack<Vehiculo> vehiculosRegistrados;
    private static Cabina instance = null;
    private double caja;

    private Cabina(){
        System.out.println("----ABRIENDO CABINA--------------------------------------");
        vehiculosRegistrados = new Stack<>();
        caja=0;
    }

    public void addVehiculo(Vehiculo vehiculo){
        double peaje = ((int) vehiculo.getModelo().charAt(0) - 65) + 1.50;
        caja = caja+peaje;
        if(!vehiculosRegistrados.contains(vehiculo)){
            vehiculosRegistrados.add(vehiculo);
            System.out.println("SE AÑADIO UN VEHICULO:");
            vehiculo.show();
            System.out.println("SE REALIZO UN PAGO DE: "+peaje+" BS");

            if(vehiculosRegistrados.size()==6){
                show();
            }

        } else{
            System.out.println("EL VEHICULO REGISTRADO:");
            vehiculo.show();
            System.out.println("PASO NUEVAMENTE POR EL PUNTO DE CONTROL");
        }
    }

    public static Cabina getInstance(){
        if (instance == null){
            instance = new Cabina();
        }
        return instance;
    }

    public void show(){
        System.out.println("--------------------CABINA "+hashCode()+"-----------------------");
        System.out.println("----------------------VEHICULOS REGISTRADOS------------------------");
        for(Vehiculo aux : vehiculosRegistrados){
            aux.show();
        }
    }
    
}
