package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio4Builder;


public class PaqueteNormalBuilder extends BuilderPaquete{

    
    @Override
    public void buildTipo() {
      paquete.setTipo("Paquete Normal");
        
    }

    @Override
    public void buildChocolate() {
        paquete.setChocolate("0");
    }

    @Override
    public void buildPipocas() {
        paquete.setPipocas("Normal");
        
    }

    @Override
    public void buildRefresco() {
        paquete.setRefresco("1, Tamaño: normal, no ilimitado");
        
    }
}
