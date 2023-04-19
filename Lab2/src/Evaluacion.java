import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Evaluacion {
    private List<Pregunta> preguntas;

    public Evaluacion() {
        preguntas = new ArrayList<>();
    }

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }

    public int realizarEvaluacion() {
        Scanner scanner = new Scanner(System.in);
        int puntajeTotal = 0;
        for (int i = 0; i < preguntas.size(); i++) {
            Pregunta preguntaActual = preguntas.get(i);
            System.out.println("Pregunta " + (i + 1) + ":");
            System.out.println(preguntaActual.getTextoPregunta());
            preguntaActual.mostrarOpciones();
            String respuestaUsuario = scanner.nextLine();
            while (!preguntaActual.esRespuestaValida(respuestaUsuario)) {
                System.out.println("Respuesta inválida. Intente nuevamente.");
                respuestaUsuario = scanner.nextLine();
            }
            int puntajePregunta = preguntaActual.getPuntaje();
// Inicializamos el puntaje total del examen en 0
            int puntajeTotal = 0;

// Recorremos todas las preguntas del examen
            for (Pregunta preguntaActual : examen.getPreguntas()) {
                System.out.println();
                System.out.println(preguntaActual.getTextoPregunta());
                preguntaActual.mostrarOpciones();

                // Pedimos al usuario que ingrese su respuesta
                Scanner scanner = new Scanner(System.in);
                String respuesta = scanner.nextLine();

                // Validamos la respuesta
                boolean esRespuestaValida = preguntaActual.esRespuestaValida(respuesta);

                // Si la respuesta es válida, sumamos los puntos de la pregunta al puntaje total
                if (esRespuestaValida) {
                    System.out.println("¡Respuesta correcta!");
                    puntajeTotal += puntajePregunta;
                } else {
                    System.out.println("Respuesta incorrecta.");
                }
            }

// Imprimimos el puntaje final del examen
            System.out.println();
            System.out.println("Puntaje total: " + puntajeTotal);

