package ejer04;

public class SmartDevice {

    protected String fabricante;
    protected String modelo;
    protected String systemOS;
    protected Double screenSize;


    public SmartDevice(){
    }

    public SmartDevice(String fabricante, String modelo, String systemOS, Double screenSize) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.systemOS = systemOS;
        this.screenSize = screenSize;
    }

}
