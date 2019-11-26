import java.util.PriorityQueue;

public class ProbandoPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Tarea> tareas = new PriorityQueue<Tarea>(Tarea.COMPARATOR_PRIORIDAD);
        tareas.add(new Tarea("Balón",3));
        tareas.add(new Tarea("Futbol",2));
        tareas.add(new Tarea("Acción",1));
        tareas.add(new Tarea("Canon",2));

        System.out.println(tareas);



    }
}
