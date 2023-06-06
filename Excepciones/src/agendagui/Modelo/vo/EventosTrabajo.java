package agendagui.Modelo.vo;

import agendagui.Modelo.vo.Evento;

public class EventosTrabajo extends Evento {
    private String Documentos;

    public EventosTrabajo(String dia, String hora, String direcion, String documentos) {
        super(dia, hora, direcion);
        Documentos = documentos;
    }

    public String getDocumentos() {
        return Documentos;
    }

    public void setDocumentos(String documentos) {
        Documentos = documentos;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", Documentos='" + Documentos + '\'';
    }

    @Override
    public void imprimir() {

    }
}
