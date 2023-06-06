package agendagui.Vista;

import agendagui.Modelo.DAO.Agenda;
import agendagui.Modelo.vo.ObjContacto;

import javax.swing.*;

public class ImprimirContactos extends JFrame{
    private JTextArea Imprimirconta;
    private JPanel Panel1;

    public ImprimirContactos(Agenda laContacto) {
        setContentPane(this.Panel1);

        for(ObjContacto o : laContacto.getListaObjetos2() )
            this.Imprimirconta.append(o.toString()+"\n");

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

}
