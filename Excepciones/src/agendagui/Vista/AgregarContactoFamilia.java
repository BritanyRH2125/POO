package agendagui.Vista;

import agendagui.Modelo.DAO.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarContactoFamilia extends JFrame {
    private JButton agregarConctactoButton;
    private JTextField Nombre;
    private JTextField Edad;
    private JTextField Telefono;
    private JTextField Tiposandre;
    private JPanel Pantalla2;

    public AgregarContactoFamilia(Agenda laAgenda) {
        setContentPane(this.Pantalla2);
        agregarConctactoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = Nombre.getText();
                int ed = Integer.parseInt(Edad.getText());
                String t = Telefono.getText();
                String ti = Tiposandre.getText();
                laAgenda.addContacto(new agendagui.Modelo.vo.ContactoFamiliar(n, ed, t, ti));
                dispose();
            }
        });
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

}
