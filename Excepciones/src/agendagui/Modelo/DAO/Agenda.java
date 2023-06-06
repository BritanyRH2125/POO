/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendagui.Modelo.DAO;

import agendagui.Modelo.vo.Contacto;
import agendagui.Modelo.vo.Evento;
import agendagui.Modelo.vo.ObjAgenda;
import agendagui.Modelo.vo.ObjContacto;

import java.util.LinkedList;

/**
 *
 * @author oviquez
 */
public class Agenda {
    private LinkedList<ObjAgenda> listaObjetos;
    private LinkedList<ObjContacto> listaObjetos2;

    public Agenda() {
        this.listaObjetos=new LinkedList<ObjAgenda>();
        this.listaObjetos2=new LinkedList<ObjContacto>();
    }

    public void addContacto(Contacto c){
        this.listaObjetos2.add(c);
    }

    public void addEvento(Evento e){
        this.listaObjetos.add(e);
    }


    public LinkedList<ObjAgenda> getListaObjetos() {
        return listaObjetos;
    }
    public LinkedList<ObjContacto> getListaObjetos2() {
        return listaObjetos2;
    }


    /*public LinkedList<ObjAgenda> getListaObjetos() {
        return listaObjetos;
    }
    private LinkedList<Evento> listaEventos;
    private LinkedList<Contacto> listaContactos;

    public Agenda() {
        this.listaContactos=new LinkedList<Contacto>();
        this.listaEventos=new LinkedList<Evento>();
    }
    
    public void addContacto(Contacto c){
        this.listaContactos.add(c);
    }
    
    public void addEvento(Evento e){
        this.listaEventos.add(e);
    }

    public LinkedList<Contacto> getListaContactos() {
        return listaContactos;
    }*/
    
    
    
}
