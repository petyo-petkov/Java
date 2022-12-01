package ejer_7_8_9;

public class Reverse {

    public static String reverse(String texto) {

        for (int i = texto.length()-1;  i >= 0;  i--){

            System.out.print(texto.charAt(i));
        }
        return texto;
    }

}
