package agendagui.GUI;

import agendagui.Data.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgreEvenWork extends JFrame {
    private JButton agregarEventoButton;
    private JTextField textDia;
    private JTextField textHora;
    private JTextField textDireccion;
    private JTextField textDocumento;
    private JPanel Pantalla5;

    public AgreEvenWork(Agenda laAgenda) {
        setContentPane(this.Pantalla5);
        agregarEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String d = textDia.getText();
                String h = textHora.getText();
                String di = textDireccion.getText();
                String doc = textDocumento.getText();
                laAgenda.addEvento(new agendagui.Data.EventosTrabajo(d, h, di, doc));
                dispose();
            }
        });
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

}
