package agendagui.Modelo.vo;

public class Logico {
private String nombre;
    private int edad;
    private String telefono;

    public Logico(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Logico() {
        this.nombre = "";
        this.edad = 0;
        this.telefono = "";
    }

    public Logico(Logico l) {
        this.nombre = l.getNombre();
        this.edad = l.getEdad();
        this.telefono = l.getTelefono();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Telefono: " + this.telefono);
    }

    @Override
    public String toString() {
        return "Logico{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                '}';
    }

}
