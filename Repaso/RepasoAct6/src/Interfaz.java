import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {
    public final static int NEW_VEHICULO = 1;
    public final static int NEW_CLIENTE = 2;
    public final static int SHOW_CLIENTES = 7;
    public final static int NEW_VENTA = 3;
    public final static int NEW_COMPRA = 4;
    public final static int GET_SALDO = 5;
    public final static int TERMINAR = 6;

    ArrayList<Cliente> listClient = new ArrayList<>();
    ArrayList<Vehiculo> listVehiculo = new ArrayList<>();
    ArrayList<Venta> listVenta = new ArrayList<>();
    ArrayList<Compra> listCompra = new ArrayList<>();

    Scanner lectorTeclado = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Cliente> getClientes(){
        return listClient;
    }

    public ArrayList<Vehiculo> getVehiculos(){
        return listVehiculo;
    }

    public void addCliente(String nombre, String apellidos, String nif, int cuentaBancaria){
        Cliente client = new Cliente(nombre, apellidos, nif, cuentaBancaria);
        if (listClient.isEmpty()) {
            listClient.add(client);
        } else {
            for (Cliente client1 : listClient) {
                if (!client1.equals(client)){
                    listClient.add(client);
                } else {
                    System.out.println("Ya ha sido añadida con anterioridad.");
                }
            }
        }
    }

    public void showClientes(ArrayList<Cliente> listClient) {
        if (this.listClient.isEmpty()){
            System.out.println("No hay ningún cliente registrado.");
        } else
            for (Cliente client : this.listClient){
                System.out.println(this.listClient.indexOf(client) + "- " + client);
                client.toString();
            }
    }

    public void addVehiculo(String modelo, String marca, String color, int anioFabricacion, String combustion, String estado, double precioRecomendado){
        Vehiculo coche = new Vehiculo(modelo, marca, color, anioFabricacion, combustion, estado, precioRecomendado);
        if (listVehiculo.isEmpty()) {
            listVehiculo.add(coche);
        } else {
            for (Vehiculo vehi : listVehiculo) {
                if (!vehi.equals(coche)){
                    listVehiculo.add(coche);
                } else {
                    System.out.println("Ya ha sido añadida con anterioridad.");
                }
            }
        }
    }

    public void showVehiculos(ArrayList<Vehiculo> listVehiculo) {
        if (this.listVehiculo.isEmpty()){
            System.out.println("No hay ningún vehiculo registrado.");
        } else
            for (Vehiculo vehiculo : this.listVehiculo){
                System.out.println(this.listVehiculo.indexOf(vehiculo) + "- " + vehiculo);
                vehiculo.toString();
            }
    }

    public Cliente askClienteVenta(ArrayList<Cliente> listClient) {
        Cliente cliente = null;
        if (!listClient.isEmpty()){
            System.out.println("Selecciona el cliente:");
            showClientes(listClient);
            cliente = listClient.get(lectorTeclado.nextInt());
        } else {
            System.out.println("No hay clientes para realizar la operación.");
        }
        return cliente;
    }

    public Vehiculo askVehiculoVenta(ArrayList<Vehiculo> listVehiculo) {
        Vehiculo vehiculo = null;
        if (!listVehiculo.isEmpty()) {
            System.out.println("Selecciona el vehiculo a vender:");
            showVehiculos(listVehiculo);
            vehiculo = listVehiculo.get(lectorTeclado.nextInt());
        } else {
            System.out.println("No hay vehiculos para realizar la operación.");
        }
        return vehiculo;
    }

    public void mostrarMenu(){
        System.out.println("\n\nSelecciona la opcción que desea realizar:\n" +
                "1. Introducir un nuevo vehículo.\n" +
                "2. Introducir un nuevo cliente.\n" +
                "3. Realizar una venta a un cliente.\n" +
                "4. Realizar una compra a un cliente.\n" +
                "5. Obtener el saldo total de un cliente que ha realizado ventas/compras en el concesionario.\n" +
                "6. Terminar.\n" +
                "-----------------------------------------------------------------------------------------------------\n" +
                "Operación a Realizar:");
    }

    public void menuNewCliente(){
        System.out.println("Nombre: ");
        String nombre = lectorTeclado.next();
        System.out.println("Apellidos: ");
        String apellidos = lectorTeclado.next();
        System.out.println("NIF: ");
        String nif = lectorTeclado.next();
        System.out.println("Cuenta Bancaria: ");
        int cuentaBancaria = lectorTeclado.nextInt();
        addCliente(nombre, apellidos, nif, cuentaBancaria);
    }

    public void menuNewVehiculo(){
        System.out.println("Modelo: ");
        String modelo = lectorTeclado.next();
        System.out.println("Marca: ");
        String marca = lectorTeclado.next();
        System.out.println("Color: ");
        String color = lectorTeclado.next();
        System.out.println("Año de Fabricación: ");
        int anioFabricacion = lectorTeclado.nextInt();
        System.out.println("Combustión(Gasolina | Gasoil): ");
        String combustion = lectorTeclado.next();
        System.out.println("Estado(Disponible | No disponible): ");
        String estado = lectorTeclado.next();
        System.out.println("Precio Recomendado: ");
        Double precioRecomendado = lectorTeclado.nextDouble();
        addVehiculo(modelo, marca, color, anioFabricacion, combustion, estado, precioRecomendado);
        //showVehiculos();

    }

    public void menuNewVenta(){
        Cliente cliente = askClienteVenta(getClientes());
        Vehiculo vehiculo = askVehiculoVenta(getVehiculos());
        System.out.println("Precio Acordado: ");
        Double precioAcordado = lectorTeclado.nextDouble();
        Venta venta = new Venta(cliente, vehiculo, precioAcordado);
        listVenta.add(venta);
    }

    public void menuNewCompra(){
        Cliente cliente = askClienteVenta(getClientes());
        Vehiculo vehiculo = askVehiculoVenta(getVehiculos());
        System.out.println("Precio Acordado: ");
        Double precioAcordado = lectorTeclado.nextDouble();
        Compra compra = new Compra(cliente, vehiculo, precioAcordado);
        listCompra.add(compra);
    }
}