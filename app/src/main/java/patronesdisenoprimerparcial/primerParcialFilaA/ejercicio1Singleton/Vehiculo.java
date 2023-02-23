package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio1Singleton;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String color;

    public Vehiculo(String placa, String modelo, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void show(){
        System.out.println("PLACA: "+placa+" MODELO: "+modelo+" COLOR: "+color);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((placa == null) ? 0 : placa.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
    
}
