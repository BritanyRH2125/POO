package agendagui.Vista;

import agendagui.Modelo.DAO.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarEventoTrabajo extends JFrame {
    private JButton agregarEventoButton;
    private JTextField textDia;
    private JTextField textHora;
    private JTextField textDireccion;
    private JTextField textDocumento;
    private JPanel Pantalla5;

    public AgregarEventoTrabajo(Agenda laAgenda) {
        setContentPane(this.Pantalla5);
        agregarEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String d = textDia.getText();
                String h = textHora.getText();
                String di = textDireccion.getText();
                String doc = textDocumento.getText();
                laAgenda.addEvento(new agendagui.Modelo.vo.EventosTrabajo(d, h, di, doc));
                dispose();
            }
        });
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

}
