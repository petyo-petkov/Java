package ejer_7_8_9;

import java.util.ArrayList;

public class ArrayInt {
    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            if(i % 2 != 0) listaNumeros.add(i);
        }
        System.out.println(listaNumeros);

    }
}
