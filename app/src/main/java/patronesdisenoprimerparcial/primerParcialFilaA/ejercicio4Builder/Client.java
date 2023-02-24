package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio4Builder;

public class Client {
    public static void main(String[] args) {
        CajeroSnackbar director = new CajeroSnackbar();
        MegaPaqueteBuilder m = new MegaPaqueteBuilder();
        PaqueteMedianoBuilder med = new PaqueteMedianoBuilder();
        PaqueteNormalBuilder n = new PaqueteNormalBuilder();

        director.setBuilder(m);
        director.buildProduct();

        Paquete p1 = director.getPaquete();
        p1.showInfo();

        director.setBuilder(med);
        director.buildProduct();

        Paquete p2 = director.getPaquete();
        p2.showInfo();

        director.setBuilder(n);
        director.buildProduct();

        Paquete p3 = director.getPaquete();
        p3.showInfo();
    }
}
