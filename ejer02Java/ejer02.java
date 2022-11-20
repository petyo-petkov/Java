package ejer02Java;

public class ejer02 {

    public static void main(String[] args) {

        Precio(1020);

    }

    static void Precio(double precio){

        //double precio = 100;
        double iva = 1.21;

        double precioConIva = precio * iva;

        System.out.println("El precio con IVA es: " + precioConIva + " euracos");

    }


}
