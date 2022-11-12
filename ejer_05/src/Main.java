public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Petyo Petkov");
        persona.setEdad(42);
        persona.setNumero_telefono(999123456);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getNumero_telefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int numero_telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumero_telefono() {
        return numero_telefono;
    }

}