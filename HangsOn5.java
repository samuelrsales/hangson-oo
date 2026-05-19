import java.util.LinkedList;
import java.util.Queue;

public class HangsOn5 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        
        fila.add("Samuel");
        fila.add("Lucas");
        fila.add("Milena");
        fila.add("João");
        fila.add("Paulo");

        System.out.println("Fila atual: " + fila);
        System.out.println("Próximo da fila: " + fila.poll());
        
        fila.remove();
        fila.remove();
        
        System.out.println("Fila atual: " + fila);
    }
}
