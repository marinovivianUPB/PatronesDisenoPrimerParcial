package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio3AbstractFactory;

public class ElectronicoFactory {
    public static IElectronico make(String tipoElectronico){
        IElectronico electronico;
        switch(tipoElectronico){
            case "television":
            electronico = new Television(tipoElectronico, 5130);
                break;
            case "refrigerador":
            electronico = new Refrigerador(tipoElectronico, 1263);
                break;
                case "microondas":
            electronico = new Microondas(tipoElectronico, 2345);
                break;
                case "radio":
            electronico = new Radio(tipoElectronico, 4600.50);
                break;
                case "batidora":
            electronico = new Batidora(tipoElectronico, 2000);
                break;
            default:
            electronico = new Television(tipoElectronico, 5130);
        }
        return electronico;
    }
}
