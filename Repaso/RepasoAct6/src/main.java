import java.util.Scanner;

public class main {
    static int selecOption;

    public static void main(String[] args) {
        Interfaz inter = new Interfaz();

        Scanner lectorTeclado = new Scanner(System.in).useDelimiter("\n");

        while (selecOption != 6) {
            inter.mostrarMenu();
            selecOption = lectorTeclado.nextInt();
            try {
                switch (selecOption){
                    case Interfaz.NEW_VEHICULO:
                        inter.menuNewVehiculo();
                        break;
                    case Interfaz.NEW_CLIENTE:
                        inter.menuNewCliente();
                        break;
                    case Interfaz.NEW_VENTA:
                        inter.menuNewVenta();
                        break;
                    case Interfaz.NEW_COMPRA:
                        inter.menuNewCompra();
                        break;
                    case Interfaz.GET_SALDO:
                        System.out.println("Coming soon...");
                        break;
                }
            } catch (Exception e) {
                System.out.println("La opción seleccionada no existe o no se encuentra disponible en este momento.");
            }
        }
    }
}
