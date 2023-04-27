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
public class ContactoFamiliar extends Contacto{
    private String parentezco;

    public ContactoFamiliar(String n, int ed, String t, String ti) {
        super(n, ed, t);
        this.parentezco = ti;
    }

    @Override
    public String toString() {
        return
                super.toString()+", Tipo de Sangre = " + parentezco;
    }

    @Override
    public void imprimir() {

    }
}
