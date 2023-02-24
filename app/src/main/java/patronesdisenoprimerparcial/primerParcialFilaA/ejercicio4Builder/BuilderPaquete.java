package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio4Builder;

public abstract class BuilderPaquete {
    protected  Paquete paquete;

    public Paquete getPaquete(){
        return paquete;
    }

    public void createPaquete(){
        paquete = new Paquete();
    }

    public abstract void buildTipo();
    public abstract void buildPipocas();
    public abstract void buildRefresco();
    public abstract void buildChocolate();

    public void showInfo(){
        paquete.showInfo();
    }
}
