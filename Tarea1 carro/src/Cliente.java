import java.util.ArrayList;

public class Cliente extends Persona{
    private ArrayList<Carro>carrosReservados = new ArrayList<Carro>();
    private ArrayList<Carro>carrosComprados = new ArrayList<Carro>();

    public Cliente(){
        super();

    }
    public Cliente( String identificacion,String nombre, String apellido1, String apellido2,
                    String telefono, String correo, String direccion){
        super (identificacion,nombre,apellido1,apellido2,telefono,correo,direccion);
        this.setCarrosComprados(carrosComprados);
        this.setCarrosReservados(carrosReservados);
    }
  public void Reservar(){}
  public void Comprar(){}

    public ArrayList<Carro> getCarrosReservados() {
        return carrosReservados;
    }

    public void setCarrosReservados(ArrayList<Carro> carrosReservados) {
        this.carrosReservados = carrosReservados;
    }

    public ArrayList<Carro> getCarrosComprados() {
        return carrosComprados;
    }

    public void setCarrosComprados(ArrayList<Carro> carrosComprados) {
        this.carrosComprados = carrosComprados;
    }

}
