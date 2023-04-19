import java.util.List;

class PreguntaSeleccionUnica implements Pregunta {
    private String textoPregunta;
    private int puntaje;
    private List<String> opciones;
    private String respuestaCorrecta;

    public PreguntaSeleccionUnica(String textoPregunta, int puntaje, List<String> opciones, String respuestaCorrecta) {
        this.textoPregunta = textoPregunta;
        this.puntaje = puntaje;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public String getTextoPregunta() {
        return textoPregunta;
    }

    @Override
    public void mostrarOpciones() {
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i));
        }
    }

    @Override
    public boolean esRespuestaValida(String respuesta) {
        int opcionSeleccionada = Integer.parseInt(respuesta) - 1;
        return opciones.get(opcionSeleccionada).equals(respuestaCorrecta);
    }

    @Override
    public int getPuntaje() {
        return puntaje;
    }
}
