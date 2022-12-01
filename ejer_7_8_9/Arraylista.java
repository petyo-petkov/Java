package ejer_7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylista {

    public static void main(String[] args) {

        ArrayList<String> miLista = new ArrayList<>();

        miLista.add("Python");
        miLista.add("Java");
        miLista.add("JavaScript");
        miLista.add("C++");

        for (String i : miLista){
            System.out.println(i);
        }

        LinkedList<String> miLinkedLista = new LinkedList<>(miLista);

        for (String i : miLinkedLista){
            System.out.println(i);
        }
     }
}
