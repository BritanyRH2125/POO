package agendagui.Vista;

import agendagui.Modelo.DAO.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarContactoTEC extends JFrame{
    private JButton agregarContactoButton;
    private JTextField textEdad;
    private JTextField textNombre;
    private JTextField textCorreo;
    private JTextField textTelefono;
    private JPanel Pantalla3;

    public AgregarContactoTEC(Agenda laAgenda) {
        setContentPane(this.Pantalla3);
        agregarContactoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = textNombre.getText();
                int ed = Integer.parseInt(textEdad.getText());
                String t = textTelefono.getText();
                String c = textCorreo.getText();
                laAgenda.addContacto(new agendagui.Modelo.vo.ContandoTec(n, ed, t, c));
                dispose();
            }
        });
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

}
