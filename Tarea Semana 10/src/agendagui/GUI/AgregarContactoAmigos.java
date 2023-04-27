package agendagui.GUI;

import agendagui.Data.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregConAmi extends JFrame {
    private JButton agregarContactoButton;
    private JTextField Nombre;
    private JTextField Edad;
    private JTextField Telefono;
    private JTextField Sobrenombre;
    private JPanel Pantalla1;

    public AgregConAmi(Agenda laAgenda) {
        setContentPane(this.Pantalla1);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();

        agregarContactoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = Nombre.getText();
                int ed = Integer.parseInt(Edad.getText());
                String t = Telefono.getText();
                String s = Sobrenombre.getText();
                laAgenda.addContacto(new agendagui.Data.ContactoAmigo(n, ed, t, s));
                dispose();
            }
        });
    }

}
