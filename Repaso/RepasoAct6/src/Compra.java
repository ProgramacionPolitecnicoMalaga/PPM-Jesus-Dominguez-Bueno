public class Compra {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double precioAcordado;

    public Compra(Cliente cliente, Vehiculo vehiculo, double precioAcordado) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.precioAcordado = precioAcordado;
    }
}
