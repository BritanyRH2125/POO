public class Carro {
    private String marca;
    private String modelo;
    private int precioCompra;
    private int precioVenta;
    private String matricula;
    private String tipo;
    private String exposicion;

    //contructor por defecto
    public Carro (){}
    public Carro(String marca,String modelo,int precioCompra,int precioVenta, String matricula, String tipo,String exposicion){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPrecioCompra(precioCompra);
        this.setPrecioVenta(precioVenta);
        this.setMatricula(matricula);
        this.setTipo(tipo);
        this. setExposicion(exposicion);
    }
    public String toString(){
        return "Carro{"+ "Marca = "
                + this.getMarca() +", modelo= "
                + this.getModelo()+", precio de compra"
                + this.getPrecioCompra()+ ", precio de venta"
                + this.getPrecioVenta()+ ", matricula"
                + this.getMatricula()+", tipo"
                + this.getTipo()+ "exposion"
                + this.getExposicion()+ "{";

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getExposicion() {
        return exposicion;
    }

    public void setExposicion(String exposicion) {
        this.exposicion = exposicion;
    }
}


