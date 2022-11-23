package ejer04;

public class Main {
    public static void main(String[] args) {


        SmartPhone pixel7Pro = new SmartPhone("Google", "Pixel7Pro", "android13", 6.7, "lector debajo la pantalla", 48);

        System.out.println(pixel7Pro.fabricante);
        System.out.println(pixel7Pro.modelo);
        System.out.println(pixel7Pro.systemOS);
        System.out.println(pixel7Pro.cameraMpx);
        System.out.println(pixel7Pro.biometric);
        System.out.println(pixel7Pro.screenSize);


        SmartWatch pixelWatch = new SmartWatch("Google", "Pixel Watch", "Waer OS", 2.0, "Glonass", true);


        System.out.println(pixelWatch.fabricante);
        System.out.println(pixelWatch.modelo);
        System.out.println(pixelWatch.systemOS);
        System.out.println(pixelWatch.screenSize);
        System.out.println(pixelWatch.acelerometro);
        System.out.println(pixelWatch.gpsType);

    }





}
