package agendagui.Data;

public class ContandoAmigos extends Contacto{
    private String Sobrenombre;

    public ContandoAmigos(Persona persona, int telefono, String sobrenombre) {
        super(persona, telefono);
        Sobrenombre = sobrenombre;
    }

    public ContandoAmigos(String n, int ed, String t, String s) {
        super(n, ed, t);
        this.Sobrenombre = s;
    }

    public String getSobrenombre() {
        return Sobrenombre;
    }

    public void setSobrenombre(String sobrenombre) {
        Sobrenombre = sobrenombre;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", Sobrenombre='" + Sobrenombre + '\'';
    }

    @Override
    public void imprimir() {

    }
}
