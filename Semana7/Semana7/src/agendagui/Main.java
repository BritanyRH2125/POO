package agendagui;
import agendagui.Data.Agenda;
import agendagui.Data.ContactoFamiliar;
import agendagui.Data.EventoReunion;
import java.util.Date;

import agendagui.Data.ObjAgenda;
import agendagui.GUI.AgendaGUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oviquez
 */
public class Main {
    
    public static AgendaGUI pantallaPrincipal;
    
    public static void main(String[] args) {
        //pantallaPrincipal = new AgendaGUI();
        //pantallaPrincipal.setVisible(true);
        Agenda miAgenda = new Agenda();

        miAgenda.addContacto(new ContactoFamiliar("hermano","Juan","88888888"));
        miAgenda.addEvento(new EventoReunion(20,new Date(),"Reunion"));
        System.out.println(miAgenda.getListaContactos().get(0).toString());
        for (ObjAgenda o: miAgenda.getListaContactos()) {
            o.imprimir();
        }

    }
    
}
