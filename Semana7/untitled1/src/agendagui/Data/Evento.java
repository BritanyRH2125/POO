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
public abstract class Evento {
    private Date fecha;
    private String nombre;

    public Evento(Date fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }
    
    
}
