public class Contando extends Agrenda
{
    private Persona persona;
    private String direccion;

    public Contando(Persona persona, String direccion) {
        this.persona = persona;
        this.direccion = direccion;
    }
    public Contando(String nombre, int edad, String direccion) {
        this.persona = new Persona(nombre, edad);
        this.direccion = direccion;
    }
}
