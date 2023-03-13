public class Reparacion {
    private String fecha;
    private String nombreMecanico;
    private String matricula;
    private String detalle;
    private int precio;
    //constructor
    public Reparacion(){}
    public Reparacion (String fecha,String nombreMecanico, String matricula,String detalle,int precio){
    this.setFecha(fecha);
    this.setNombreMecanico(nombreMecanico);
    this.setMatricula(matricula);
    this.setDetalle(detalle);
    this.setPrecio(precio);
    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "fecha='" + fecha + '\'' +
                ", nombreMecanico='" + nombreMecanico + '\'' +
                ", matricula='" + matricula + '\'' +
                ", detalle='" + detalle + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreMecanico() {
        return nombreMecanico;
    }

    public void setNombreMecanico(String nombreMecanico) {
        this.nombreMecanico = nombreMecanico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
