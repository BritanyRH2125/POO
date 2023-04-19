package AgendaGUI.AgendaGUI.src.agendagui;


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
        pantallaPrincipal = new AgendaGUI();
        pantallaPrincipal.setVisible(true);
    }
    
}
