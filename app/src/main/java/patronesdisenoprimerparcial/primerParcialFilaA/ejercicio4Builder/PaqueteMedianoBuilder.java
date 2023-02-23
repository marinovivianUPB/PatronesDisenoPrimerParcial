package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio4Builder;

public class PaqueteMedianoBuilder extends BuilderPaquete {
    @Override
    public void buildChocolate() {
        paquete.setChocolate("1, Tamaño: normal");
    }

    @Override
    public void buildPipocas() {
        paquete.setPipocas("Grandes");
        
    }

    @Override
    public void buildRefresco() {
        paquete.setRefresco("2, Tamaño: normal, no ilimitado");
        
    }
}
