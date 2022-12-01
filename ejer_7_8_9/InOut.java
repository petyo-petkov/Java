package ejer_7_8_9;
import java.io.InputStream;

import java.io.*;

public class InOut {

    public static void main(String[] args) {

        Copiadora();


    }

    public static void Copiadora() {
        try{
            InputStream fileIN = new FileInputStream("C:/Users/petyo/IdeaProjects/POO/src/ejer_7_8_9/texto.txt");

            try {
                byte [] datos = fileIN.readAllBytes();
                fileIN.close();

                PrintStream fileOut = new PrintStream("C:/Users/petyo/IdeaProjects/POO/src/ejer_7_8_9/nuevoTexto.txt");
                fileOut.write(datos);
                fileOut.close();

            }catch (IOException e){
                System.out.println("Exception " + e.getMessage());
            }

        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado" + e.getMessage());
        }




    }

}
