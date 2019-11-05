import java.util.Comparator;

public class Comparador implements Comparator<ClasePrueba> {

    @Override
    public int compare(ClasePrueba clasePrueba, ClasePrueba t1) {
        if (clasePrueba.getValor() < t1.getValor())
            return 1;
        else if (clasePrueba.getValor() == t1.getValor())
            return 0;
        else
            return -1;

        // se puede reemplazar por return Integer.compare(t1.getValor(), clasePrueba.getValor());

    }
}
