import java.util.HashMap;
import java.util.Map;

public class HangsOn4 {
    public static void main(String[] args) {
        Map<Integer, String> alunos = new HashMap<>();

        alunos.put(1, "Samuel");
        alunos.put(2, "Lucas");
        alunos.put(3, "Paulo");
        alunos.put(4, "João");
        alunos.put(5, "Ricardo");

        System.out.println("Alunos: " + alunos);
        System.out.println(alunos.get(1));
        System.out.println(alunos.remove(2));
        System.out.println("Alunos: " + alunos);

        for(String nome: alunos.values()) {
            System.out.println(nome);
        }
    }
}
