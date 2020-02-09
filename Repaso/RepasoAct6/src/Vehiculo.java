public class Vehiculo {

    private String modelo;
    private String marca;
    private String color;
    private int anioFabricacion;
    private String combustion;
    private String estado;
    private double precioRecomendado;

    public Vehiculo(String modelo, String marca, String color, int anioFabricacion, String combustion, String estado, double precioRecomendado) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.combustion = combustion;
        this.estado = estado;
        this.precioRecomendado = precioRecomendado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getCombustion() {
        return combustion;
    }

    public void setCombustion(String combustion) {
        this.combustion = combustion;
    }

    public double getPrecioRecomendado() {
        return precioRecomendado;
    }

    public void setPrecioRecomendado(double precioRecomendado) {
        this.precioRecomendado = precioRecomendado;
    }

    @Override
    public String toString() {
        return "Vehiculo --- modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", combustion='" + combustion + '\'' +
                ", estado='" + estado + '\'' +
                ", precioRecomendado=" + precioRecomendado;
    }
}
