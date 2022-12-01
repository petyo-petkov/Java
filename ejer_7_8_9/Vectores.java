package ejer_7_8_9;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {

        Vector<String> miVector = new Vector<>();

        miVector.add("Python");
        miVector.add("Java");
        miVector.add("Kotlin");
        miVector.add("BASIC");
        miVector.add("php");

        for(String i : miVector){
            System.out.println(i);
        }

        miVector.remove(1);
        miVector.remove(1);

        for(String i : miVector){

            System.out.println(i);
        }


    }
}
