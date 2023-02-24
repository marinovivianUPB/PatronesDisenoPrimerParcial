package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio4Builder;

public class Paquete {
    private String tipo;
    private String pipocas;
    private String refresco;
    private String chocolate;


    
    public String getPipocas() {
        return pipocas;
    }
    public Paquete setPipocas(String pipocas) {
        this.pipocas = pipocas;
        return this;
    }
    public String getRefresco() {
        return refresco;
    }
    public Paquete setRefresco(String refresco) {
        this.refresco = refresco;
        return this;
    }
    public String getChocolate() {
        return chocolate;
    }
    public Paquete setChocolate(String chocolate) {
        this.chocolate = chocolate;
        return this;
    }

    public void showInfo(){
        System.out.println("------------------"+tipo+"-------------------------");
        System.out.println("PIPOCAS: "+pipocas);
        System.out.println("REFRESCO: "+refresco);
        System.out.println("CHOCOLATE: "+chocolate);
    }
    public String getTipo() {
        return tipo;
    }
    public Paquete setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    
}
