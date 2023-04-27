package agendagui.GUI;

import agendagui.Data.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarMain extends JFrame {
    private JPanel panel1;
    private JButton agregarContactoButton;
    private JButton mostrarContactosButton;
    private JButton mostrarAgrendaButton;
    private JButton button4;
    private JComboBox comboBox1Evento;
    private JButton agregarEventoButton;
    private JComboBox comboBoxConta;
    private Agenda laAgenda;


    public AgregarMain() {
        this.laAgenda = new Agenda();
        setContentPane(this.panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);

        agregarEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1Evento.getSelectedIndex() == 0) {
                    (new AgregarEventoFamilia(laAgenda)).setVisible(true);
                }
                if (comboBox1Evento.getSelectedIndex() == 1) {
                    (new AgregarEventoTrabajo(laAgenda)).setVisible(true);
                }
            }
        });
        agregarContactoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBoxConta.getSelectedIndex() == 0) {
                    (new AgregarContactoFamilia(laAgenda)).setVisible(true);
                }
                if (comboBoxConta.getSelectedIndex() == 1) {
                    (new AgregarContactoAmigos(laAgenda)).setVisible(true);
                }
                if (comboBoxConta.getSelectedIndex() == 2) {
                    (new AgregarContactoTEC(laAgenda)).setVisible(true);
                }

            }
        });
        mostrarContactosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                (new ImprimirContactos(laAgenda)).setVisible(true);
            }
        });
        mostrarAgrendaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                (new ImprimirAgenda(laAgenda)).setVisible(true);
            }
        });

        mostrarContactosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                (new ImprimirContactos(laAgenda)).setVisible(true);
            }
        });
    }
}
