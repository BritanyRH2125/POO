/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendagui.Data;

/**
 *
 * @author oviquez
 */
public abstract class Contacto implements ObjContacto {
    
    private Persona persona;
    private int telefono;

    public Contacto(Persona persona, int telefono) {
        this.persona = persona;
        this.telefono = telefono;
    }

    public Contacto(String n, int ed, String t) {
        this.persona = new Persona(n,ed);
        this.telefono = Integer.parseInt(t);
    }

    @Override
    public String toString() {
        return
                 persona +
                ", telefono=" + telefono;
    }
}
