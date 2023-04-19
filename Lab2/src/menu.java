import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvaluacionUI extends JFrame implements ActionListener {
    private JLabel preguntaLabel;
    private JTextField respuestaField;
    private JButton enviarButton;
    private JLabel resultadoLabel;
    private Evaluacion evaluacion;
    private int indicePreguntaActual;

    public EvaluacionUI(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
        this.indicePreguntaActual = 0;

        // Configuración de la ventana
        setTitle("Evaluación");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 200));

        // Creación de los componentes de la interfaz
        preguntaLabel = new JLabel();
        respuestaField = new JTextField();
        enviarButton = new JButton("Enviar");
        enviarButton.addActionListener(this);
        resultadoLabel = new JLabel();

        // Ubicación de los componentes en la ventana
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(preguntaLabel, constraints);
        constraints.gridy = 1;
        panel.add(respuestaField, constraints);
        constraints.gridy = 2;
        panel.add(enviarButton, constraints);
        constraints.gridy = 3;
        panel.add(resultadoLabel, constraints);

        add(panel);
        pack();

        mostrarSiguientePregunta();
    }

    private void mostrarSiguientePregunta() {
        if (indicePreguntaActual < evaluacion.getPreguntas().size()) {
            Pregunta preguntaActual = evaluacion.getPreguntas().get(indicePreguntaActual);
            preguntaLabel.setText(preguntaActual.getPregunta());
            respuestaField.setText("");
            resultadoLabel.setText("");
            indicePreguntaActual++;
        } else {
            JOptionPane.showMessageDialog(this, "Evaluación completada");
            dispose();
        }
    }

    private void evaluarRespuesta() {
        Pregunta preguntaActual = evaluacion.getPreguntas().get(indicePreguntaActual - 1);
        String respuestaUsuario = respuestaField.getText();
        if (preguntaActual.evaluarRespuesta(respuestaUsuario)) {
            resultadoLabel.setText("Respuesta correcta");
            evaluacion.sumarPuntos(preguntaActual.getPuntos());
        } else {
            resultadoLabel.setText("Respuesta incorrecta");
        }
        mostrarSiguientePregunta();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enviarButton) {
            evaluarRespuesta();
        }
    }

    public static void main(String[] args) {
        // Creación de la evaluación
        Evaluacion evaluacion = new Evaluacion();
        evaluacion.agregarPregunta(new PreguntaSeleccionUnica("¿Cuál es la capital de Francia?", 5,
                new String[]{"Madrid", "Londres", "París", "Berlín"}));
        // Agregar preguntas a la evaluación
        evaluacion.agregarPregunta(new PreguntaRespuestaBreve("¿En qué año se fundó Google?", 10,
                new String[]{"1998", "Mil novecientos noventa y ocho"}));

        PreguntaSeleccionUnica pregunta2 = new PreguntaSeleccionUnica("¿Cuál de las siguientes opciones NO es un lenguaje de programación?", 20);
        pregunta2.agregarOpcion("Java");
        pregunta2.agregarOpcion("Python");
        pregunta2.agregarOpcion("Ruby");
        pregunta2.agregarOpcion("HTML");
        pregunta2.agregarOpcion("CSS");
        pregunta2.agregarRespuestaCorrecta("HTML");
        evaluacion.agregarPregunta(pregunta2);

        PreguntaSeleccionUnica pregunta3 = new PreguntaSeleccionUnica("¿En qué país se encuentra la Torre Eiffel?", 20);
        pregunta3.agregarOpcion("Italia");
        pregunta3.agregarOpcion("Francia");
        pregunta3.agregarOpcion("Alemania");
        pregunta3.agregarOpcion("Inglaterra");
        pregunta3.agregarRespuestaCorrecta("Francia");
        evaluacion.agregarPregunta(pregunta3);

        evaluacion.agregarPregunta(new PreguntaRespuestaBreve("¿Cuál es la capital de Australia?", 10,
                new String[]{"Canberra"}));

        PreguntaSeleccionUnica pregunta5 = new PreguntaSeleccionUnica("¿Quién es considerado el padre de la computación?", 20);
        pregunta5.agregarOpcion("Bill Gates");
        pregunta5.agregarOpcion("Steve Jobs");
        pregunta5.agregarOpcion("Alan Turing");
        pregunta5.agregarOpcion("Tim Berners-Lee");
        pregunta5.agregarOpcion("Ada Lovelace");
        pregunta5.agregarRespuestaCorrecta("Alan Turing");
        evaluacion.agregarPregunta(pregunta5);

// Mostrar preguntas y obtener respuestas del usuario
        for (Pregunta pregunta : evaluacion.getPreguntas()) {
            System.out.println(pregunta.getTextoPregunta());
            pregunta.mostrarOpciones();

            String respuesta = scanner.nextLine();

            while (!pregunta.esRespuestaValida(respuesta)) {
                System.out.println("Respuesta inválida. Intente de nuevo.");
                respuesta = scanner.nextLine();
            }

            evaluacion.responderPregunta(pregunta, respuesta);
        }

// Mostrar resultado final
        System.out.println("Su nota final es: " + evaluacion.calcularNota());
