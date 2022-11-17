public class Main {
    public static void main(String[] args) {
        Persona ejemplo = new Persona();
        ejemplo.setEdad(23);
        ejemplo.setNombre("Fulano");
        ejemplo.setTelefono(12345678);

        System.out.println(ejemplo.getEdad());
        System.out.println(ejemplo.getNombre());
        System.out.println(ejemplo.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}