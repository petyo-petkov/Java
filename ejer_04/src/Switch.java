public class Switch {
    public static void main(String[] args){
        var estacion = "verano";

        switch (estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "inviernop":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Ne es una estacion");


        }
    }
}
