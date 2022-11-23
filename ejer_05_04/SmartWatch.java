package ejer04;

public class SmartWatch extends SmartDevice{

    String gpsType;
    boolean acelerometro;


    public SmartWatch(){
    }

    public SmartWatch(String fabricante, String modelo, String systemOS, Double screenSize, String gpsType, boolean acelerometro) {
        super(fabricante, modelo, systemOS, screenSize);
        this.gpsType = gpsType;
        this.acelerometro = acelerometro;
    }
}
