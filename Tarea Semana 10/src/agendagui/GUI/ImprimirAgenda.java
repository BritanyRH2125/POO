package agendagui.GUI;

import agendagui.Data.Agenda;
import agendagui.Data.ObjAgenda;
import agendagui.Data.ObjContacto;

import javax.swing.*;

public class PrintAge extends JFrame{
    private JTextArea impAgrenda;
    private JPanel panel2;

    public PrintAge(Agenda laAgenda) {
        setContentPane(this.panel2);

        for (ObjAgenda o : laAgenda.getListaObjetos())
            this.impAgenda.append(o.toString() + "\n");

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

}
