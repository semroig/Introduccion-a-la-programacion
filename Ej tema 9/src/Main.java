public class Main {
    public static void main(String[] args) {

        // Creo una instancia del objeto Cliente
        Cliente cliente1 = new Cliente();
        cliente1.edad = 34;
        cliente1.nombre = "carlos";
        cliente1.telefono = 12345678;
        cliente1.credito = 34000;

        System.out.println(cliente1.edad);
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.credito);

        // Creo una instancia del objeto Cliente
        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 23;
        trabajador1.nombre = "juan";
        trabajador1.telefono = 56781234;
        trabajador1.salario = 85000;

        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.telefono);
        System.out.println(trabajador1.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}