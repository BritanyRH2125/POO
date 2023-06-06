package agendagui.Modelo.vo;

import agendagui.Modelo.vo.Evento;

public class EventoFamilia extends Evento {
    private String regalo;

    public EventoFamilia(String dia, String hora, String direcion, String regalo) {
        super(dia, hora, direcion);
        this.regalo = regalo;
    }

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", regalo='" + regalo + '\'';
    }

    @Override
    public void imprimir() {

    }
}
