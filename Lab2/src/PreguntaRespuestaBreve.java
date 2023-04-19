import java.util.List;

class PreguntaRespuestaBreve implements Pregunta {
    private String textoPregunta;
    private int puntaje;
    private List<String> respuestasCorrectas;

    public PreguntaRespuestaBreve(String textoPregunta, int puntaje, List<String> respuestasCorrectas) {
        this.textoPregunta = textoPregunta;
        this.puntaje = puntaje;
        this.respuestasCorrectas = respuestasCorrectas;
    }

    @Override
    public String getTextoPregunta() {
        return textoPregunta;
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Escriba la respuesta:");
    }

    @Override
    public boolean esRespuestaValida(String respuesta) {
        for (String respuestaCorrecta : respuestasCorrectas) {
            if (respuesta.toLowerCase().contains(respuestaCorrecta.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getPuntaje() {
        return puntaje;
    }
}
