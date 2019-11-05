public class SacarElementoDeColaVaciaException extends ArrayIndexOutOfBoundsException {

    public SacarElementoDeColaVaciaException(String message){
        super(message);
        System.out.println("La cola está vacia, no se puede sacar ningun elemento.");
    }
}
