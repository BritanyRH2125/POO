package agendagui.Data;

public class ContandoTec extends Contacto {
    private String correo;

    public ContandoTec(Persona persona, int telefono, String correo) {
        super(persona, telefono);
        this.correo = correo;
    }

    public ContandoTec(String n, int ed, String t, String c) {
        super(n, ed, t);
        this.correo = c;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;

    }

    @Override
    public String toString() {
        return super.toString()+", correo='" + correo + '\'' ;

    }

    @Override
    public void imprimir() {

    }
}
