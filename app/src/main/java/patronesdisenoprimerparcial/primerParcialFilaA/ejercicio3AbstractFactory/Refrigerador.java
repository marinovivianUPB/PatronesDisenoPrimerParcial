package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio3AbstractFactory;

public class Refrigerador implements IElectronico{

    private String tipo;
    private double precio;
    
    

    public Refrigerador(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void show() {
        System.out.println("TIPO: "+tipo+" PRECIO: "+precio);
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }
    
}
