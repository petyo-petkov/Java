public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.añadir_puertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        int resultado;
        resultado = a + b;

        System.out.println(resultado);
        return resultado;
    }
}

class Coche {
    public int puertas = 0;
    public void añadir_puertas() {
        this.puertas++;
    }


}