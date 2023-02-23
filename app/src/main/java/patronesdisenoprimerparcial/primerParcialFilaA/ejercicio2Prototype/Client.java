package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio2Prototype;

public class Client {
    public static void main(String[] args) {
        Televisor nuevoTelevisor = new Televisor("android", "11.0", 80, 50, true, 4, true, true, "ABCDE12345");
        Televisor a = nuevoTelevisor.clone();
        Televisor b = nuevoTelevisor.clone();
        Televisor c = nuevoTelevisor.clone();
        Televisor d = nuevoTelevisor.clone();
        Televisor e = nuevoTelevisor.clone();

        a.setSerialDelTelevisor("BCDEF23456");
        b.setSerialDelTelevisor("CDEFG56789");
        c.setSerialDelTelevisor("BCDEF34567");
        d.setSerialDelTelevisor("DEFGH45678");
        e.setSerialDelTelevisor("EFGHI56789");

        System.out.println("------------TELEVISORES A LA VENTA-----------------");
        a.show();
        b.show();
        c.show();
        d.show();
        e.show();
    }
}
