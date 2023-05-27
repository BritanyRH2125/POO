import controlador.Coordinador;
import modelo.Logica;
import vista.VentanaBuscar;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;

public class Principal {
	
	private Logica miLogica;
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaBuscar miVentanaBuscar;
	private VentanaRegistro miVentanaRegistro;
	private Coordinador miCoordinador;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Principal miPrincipal=new Principal();
		miPrincipal.iniciar();
	}

	/**
	 * - The model is responsible for managing the data of the application. It receives user input from the controller.
	 * - The view renders presentation of the model in a particular format.
	 * - The controller responds to the user input and performs interactions on the data model objects.
	 *     The controller receives the input, optionally validates it and then passes the input to the model.
	 */
	private void iniciar() {
		/*Se instancian las clases*/
		miVentanaPrincipal=new VentanaPrincipal();
		miVentanaRegistro=new VentanaRegistro();
		miVentanaBuscar= new VentanaBuscar();
		miLogica=new Logica();
		miCoordinador= new Coordinador();
		
		/*Se establecen las relaciones entre clases*/
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miVentanaRegistro.setCoordinador(miCoordinador);
		miVentanaBuscar.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		
		/*Se establecen relaciones con la clase coordinador*/
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiVentanaRegistro(miVentanaRegistro);
		miCoordinador.setMiVentanaBuscar(miVentanaBuscar);
		miCoordinador.setMiLogica(miLogica);
				
		miVentanaPrincipal.setVisible(true);
	}

}
