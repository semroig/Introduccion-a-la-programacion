public class Main {
    public static void main(String[] args) {
        int test = suma(2, 4, 7);
        System.out.println(test);

        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}

class Coche {
    public int puertas = 0;

    public void AumentarPuertas() {
        this.puertas++;
    }
}