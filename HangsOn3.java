import java.util.HashSet;
import java.util.Set;

public class HangsOn3 {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Samuel");
        alunos.add("Pedro");
        alunos.add("João");
        alunos.add("João");
        alunos.add("Tiago");
        alunos.add("Tiago");
        alunos.add("Bruno");
        alunos.add("Bruno");
        alunos.add("Samuel");
        alunos.add("Samuel");

        System.out.println("Lista de nomes:");

        for (String nome: alunos) {
            System.out.println(nome);
        }

        System.out.println("Quantidade de alunos totais: " + alunos.size());
    }
}
