public class Main {

    public static void main(String[] args) {
        try{
            int[] array = new int[5];
            array[5] = 3;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fuera de rango");
        } finally {
            System.out.println("Y otra cosa más...");
        }
    }
}
