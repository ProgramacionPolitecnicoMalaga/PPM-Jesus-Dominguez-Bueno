public class ConsumidorCola {
    private static Cola cola;
    private static final int TAM_COLA = 5;

    public static void main(String[] args) {
        cola = new Cola(TAM_COLA);
        System.out.println(cola);
        cola.sacar();
    }
}