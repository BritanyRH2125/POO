public class ContadoTec extends Contando{
    private String correo;
    public ContadoTec(Persona persona, String direccion, String correo) {
        super(persona, direccion);
        this.correo = correo;
    }

    @Override //segunda opcion
    public String toString() {
        return "ContadoTec{" +
                "correo='" + correo + '\'' +
                "} " + super.toString();
    }
}
