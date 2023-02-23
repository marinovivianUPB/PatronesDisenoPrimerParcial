package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio3AbstractFactory;


public class Client {
    public static void main(String[] args) {
        Television tele = (Television) ElectronicoFactory.make("television");
        Refrigerador r = (Refrigerador) ElectronicoFactory.make("refrigerador");
        Microondas m = (Microondas) ElectronicoFactory.make("microondas");
        Radio ra = (Radio) ElectronicoFactory.make("radio");
        Batidora b = (Batidora) ElectronicoFactory.make("batidora");

        tele.show();
        r.show();
        m.show();
        ra.show();
        b.show();
    }
}
