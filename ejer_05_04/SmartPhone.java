package ejer04;

public class SmartPhone extends SmartDevice {

    String biometric;
    int cameraMpx;



    public SmartPhone(){
    }

    public SmartPhone(String fabricante, String modelo, String systemOS, Double screenSize, String biometric, int cameraMpx) {
        super(fabricante, modelo, systemOS, screenSize);
        this.biometric = biometric;
        this.cameraMpx = cameraMpx;
    }
}
