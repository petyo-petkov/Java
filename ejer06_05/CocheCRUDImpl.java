package ejer06_05;

import poo.herencia.Coche;

public class CocheCRUDImpl implements CocheCRUD{



    @Override
    public void save() {
        System.out.println(" Crear coche");

    }

    @Override
    public void delete() {
        System.out.println("Borrar coche");

    }

    @Override
    public void findAll() {
        System.out.println("Mostrar todos los coches");

    }
}
