package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio4Builder;

public class CajeroSnackbar {
    private BuilderPaquete builder;

    public Paquete getPaquete(){
        return builder.getPaquete();
    }

    public void setBuilder(BuilderPaquete builder){
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createPaquete();
        this.builder.buildChocolate();
        this.builder.buildPipocas();
        this.builder.buildRefresco();
        this.builder.buildTipo();
    }
}
