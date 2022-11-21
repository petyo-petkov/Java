package com.company;

public class ejer_03 {

    public static void main(String[] args) {


        String[] nombres = {"Petyo", "Stoyanov", "Petkov"};

        String nombreCompleto = "";

        for (String nombre : nombres) {

            nombreCompleto = nombreCompleto + " " +  nombre ;


        }
        System.out.println(nombreCompleto);


        }
    }

