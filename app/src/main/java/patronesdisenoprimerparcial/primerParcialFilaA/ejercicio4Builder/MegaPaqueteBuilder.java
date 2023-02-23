package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio4Builder;

public class MegaPaqueteBuilder extends BuilderPaquete{

    @Override
    public void buildChocolate() {
        paquete.setChocolate("2, Tamaño: grande");
    }

    @Override
    public void buildPipocas() {
        paquete.setPipocas("Extra Grandes");
        
    }

    @Override
    public void buildRefresco() {
        paquete.setRefresco("3, Tamaño: extra grandes, ilimitado");
        
    }
    
}
