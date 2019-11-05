import java.util.ArrayList;
import java.util.Iterator;

public class TrabajoArrayList {

    public static void main(String[] args) {
        //ClasePrueba elementoABorrar = new ClasePrueba(100, "e1");
        ArrayList<ClasePrueba> array = new ArrayList<>();
        array.add(new ClasePrueba(1, "e1"));
        array.add(new ClasePrueba(2, "e2"));
        array.add(new ClasePrueba(3, "e3"));
        array.add(new ClasePrueba(100, "e0"));
        array.set(1, new ClasePrueba(100, "e100"));
        array.add(new ClasePrueba(100, "e200"));
        array.remove(new ClasePrueba(3, "e1"));

        ClasePrueba elementoBuscado = new ClasePrueba(100, "e100");
        Iterator<ClasePrueba> iterator = array.iterator();
        int i = 0;
        while (iterator.hasNext()){
            i++;
            if (elementoBuscado.equals(iterator.next())){
                System.out.println(i);
            }
        }




    }
}