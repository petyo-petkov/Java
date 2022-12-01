package ejer_7_8_9;

public class BiArray {
    public static void main(String[] args) {

        String bilista [][]  = new String[2][3];

        bilista[0][0] = "Python";
        bilista[0][1] = "Kotlin";
        bilista[0][2] = "BASIC";
        bilista[1][0] = "primero";
        bilista[1][1] = "segundo";
        bilista[1][2] = "tercero";

        for ( int i = 0; i < bilista.length; i++){
            for( int j = 0; j < bilista[i].length; j++){
                System.out.println(bilista[i][j]);
            }

        }

    }
}
