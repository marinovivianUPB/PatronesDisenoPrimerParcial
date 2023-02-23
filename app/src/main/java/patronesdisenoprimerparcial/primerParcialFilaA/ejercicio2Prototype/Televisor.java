package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio2Prototype;

public class Televisor implements TelevisorPrototype {

    private String sistemaOperativo;
    private String versionSistemaOperativo;
    private double pulgadas;
    private double resolucion;
    private boolean puertoHDMI;
    private int puertosUSB;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String serialDelTelevisor;

    

    public Televisor(String sistemaOperativo, String versionSistemaOperativo, double pulgadas, double resolucion,
            boolean puertoHDMI, int puertosUSB, boolean controlRemoto, boolean bluetooth, String serialDelTelevisor) {
        this.sistemaOperativo = sistemaOperativo;
        this.versionSistemaOperativo = versionSistemaOperativo;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
        this.puertosUSB = puertosUSB;
        this.controlRemoto = controlRemoto;
        this.bluetooth = bluetooth;
        this.serialDelTelevisor = serialDelTelevisor;
    }


    public String getSistemaOperativo() {
        return sistemaOperativo;
    }


    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }



    public String getVersionSistemaOperativo() {
        return versionSistemaOperativo;
    }



    public void setVersionSistemaOperativo(String versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }



    public double getPulgadas() {
        return pulgadas;
    }



    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }



    public double getResolucion() {
        return resolucion;
    }



    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }



    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }



    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }



    public int getPuertosUSB() {
        return puertosUSB;
    }



    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }



    public boolean isControlRemoto() {
        return controlRemoto;
    }



    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }



    public boolean isBluetooth() {
        return bluetooth;
    }



    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }



    public String getSerialDelTelevisor() {
        return serialDelTelevisor;
    }



    public void setSerialDelTelevisor(String serialDelTelevisor) {
        this.serialDelTelevisor = serialDelTelevisor;
    }



    @Override
    public Televisor clone(){
        Televisor clone = new Televisor(this.sistemaOperativo, this.versionSistemaOperativo, this.pulgadas, this.resolucion,
        this.puertoHDMI, this.puertosUSB, this.controlRemoto, this.bluetooth, this.serialDelTelevisor);
        return clone;
    }

    public void show(){
        System.out.println("----------------------TELEVISOR:"+ serialDelTelevisor+"----------------------");
        System.out.println("SO: "+sistemaOperativo+" VERSION: "+versionSistemaOperativo);
        System.out.println("PULGADAS: "+pulgadas+" RESOLUCION: "+resolucion);
        System.out.println("PUERTO HDMI: "+puertoHDMI+" PUERTOS USB: "+puertosUSB);
        System.out.println("CONTROL REMOTO: "+controlRemoto+" BLUETOOTH: "+bluetooth);
    }
    
}
