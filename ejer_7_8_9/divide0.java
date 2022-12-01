package ejer_7_8_9;

public class divide0 {
    public static void main(String[] args) {

        try{
            DividePorCero(3, 0);

        }catch (ArithmeticException e) {
            System.out.println(" Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }

    }

    public static int DividePorCero(int a, int b) throws ArithmeticException {
        try{
            return a / b ;

        }catch (ArithmeticException e){
            throw new ArithmeticException();

        }

    }
}
