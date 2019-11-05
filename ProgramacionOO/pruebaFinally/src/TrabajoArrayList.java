import java.util.ArrayList;
import java.util.Iterator;

public class TrabajoArrayList {

    public static boolean predicado(ClasePrueba elemento){

    }

    public static void main(String[] args) {
        ClasePrueba elementoABorrar = new ClasePrueba(100, "e1")
        ArrayList<ClasePrueba> array = new ArrayList<>();
        array.add(new ClasePrueba(1, "e1"));
        array.add(new ClasePrueba(2, "e2"));
        array.add(new ClasePrueba(3, "e3"));
        array.set(1, new ClasePrueba(0, "e0"));
        array.set(1, new ClasePrueba(100, "e100"));
        array.remove(new ClasePrueba(3, "e1"));
        array.remove(elementoABorrar);
        Iterator<ClasePrueba> it = array.iterator();
        while (it.hasNext())
            System.out.println(it.Next);
        for (elemento -> {elemento.setCadena("-"+elemento.getCadena()+"-");});
        System.out.println(array);


    }
}