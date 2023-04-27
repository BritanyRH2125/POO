/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendagui.Data;

import java.util.Date;

/**
 *
 * @author oviquez
 */
public abstract class Evento implements ObjAgenda {
    private String dia;
    private String hora;
    private String direcion;

    public Evento(String dia, String hora, String direcion) {
        this.dia = dia;
        this.hora = hora;
        this.direcion = direcion;
    }

    @Override
    public String toString() {
        return  "dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", direcion='" + direcion + '\'';
    }
}
