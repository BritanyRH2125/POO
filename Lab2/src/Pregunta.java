import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Pregunta {
    String getTextoPregunta();
    void mostrarOpciones();
    boolean esRespuestaValida(String respuesta);
    int getPuntaje();
}

