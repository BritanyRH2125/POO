package agendagui.Control;

import agendagui.Modelo.DAO.Agenda;

public class Coordinador {
private Agenda agenda;

    public Coordinador() {
        this.agenda = new Agenda();
    }

    public void addContacto(agendagui.Modelo.vo.Contacto c){
        this.agenda.addContacto(c);
    }

    public void addEvento(agendagui.Modelo.vo.Evento e){
        this.agenda.addEvento(e);
    }
}
