public class Main {
    public static void main(String[] args) {
        int numerolf = 5;
        if(numerolf > 0){
            System.out.println("Es positivo");
        } else if (numerolf == 0) {
            System.out.println("Es cero");
        } else {
            System.out.println("Es negativo");
        }

        int numeroWhile = 2;
        while (numeroWhile < 3){
            System.out.println("Ejecutando el ciclo while");
            numeroWhile++;
        }

        boolean condDoWhile = true;
        do {
            System.out.println("Ejecutando el ciclo do while");
            condDoWhile = false;
        } while (condDoWhile);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "verano";
        switch(estacion){
            case "verano":
                System.out.println("verano");
                break;
            case "otono":
                System.out.println("otono");
                break;
            case "invierno":
                System.out.println("invierno");
                break;
            case "primavera":
                System.out.println("primavera");
                break;
            default:
                System.out.println("el valor no es una estacion");
                break;
        }
    }
}