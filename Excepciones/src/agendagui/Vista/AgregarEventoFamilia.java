package agendagui.Vista;

import agendagui.Modelo.DAO.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarEventoFamilia extends JFrame {
    private JButton agregarEventoButton;
    private JTextField textDia;
    private JTextField textDirecion;
    private JTextField textHora;
    private JTextField textRegalo;
    private JPanel Pantalla4;

    public AgregarEventoFamilia(Agenda laAgenda) {
        setContentPane(this.Pantalla4);
        agregarEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String d = textDia.getText();
                String di = textDirecion.getText();
                String h = textHora.getText();
                String r = textRegalo.getText();
                laAgenda.addEvento(new agendagui.Modelo.vo.EventoFamilia(d, di, h, r));
                dispose();
            }
        });
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
