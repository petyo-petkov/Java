import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Jose Mari";
        cliente.edad = 42;
        cliente.telefono = 999456123;
        cliente.credito = 20.0000;

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Mari Puri";
        trabajador.edad = 34;
        trabajador.telefono = 990678456;
        trabajador.salario = 2500;

        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);

    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
