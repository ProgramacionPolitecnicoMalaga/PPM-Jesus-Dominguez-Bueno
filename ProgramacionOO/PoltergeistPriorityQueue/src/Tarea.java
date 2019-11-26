import java.util.Comparator;
import java.util.Objects;

public class Tarea {
    private String descripcion;
    private int prioridad;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public static final Comparator<Tarea> COMPARATOR_PRIORIDAD = new Comparator<Tarea>() {
        @Override
        public int compare(Tarea tarea, Tarea t1) {
            return tarea.getPrioridad() - t1.getPrioridad();
        }
    };

    public static final Comparator<Tarea> COMPARATOR_DESCRIPCION = new Comparator<Tarea>() {
        @Override
        public int compare(Tarea tarea, Tarea t1) {
            return t1.getDescripcion().compareTo(tarea.getDescripcion());
        }
    };

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }

}
