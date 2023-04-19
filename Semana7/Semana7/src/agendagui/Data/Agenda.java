/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendagui.Data;

import java.util.LinkedList;

/**
 *
 * @author oviquez
 */
public class Agenda {
   // private LinkedList<Evento> listaEventos;
   // private LinkedList<Contacto> listaContactos;
    private LinkedList<ObjAgenda> listaobjecto;
    public Agenda() {
        this.listaobjecto=new LinkedList<ObjAgenda>();
        //this.listaEventos=new LinkedList<Evento>();
    }
    
    public void addContacto(Contacto c){
        this.listaobjecto.add(c);
    }
    
    public void addEvento(Evento e){
        this.listaobjecto.add(e);
    }

    public LinkedList<ObjAgenda> getListaContactos() {
        return listaobjecto;
    }
    
    
    
}
