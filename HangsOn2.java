import java.util.ArrayList;
import java.util.List;

public class HangsOn2 {
    public static void main(String[] args) {
        List<Double> medias = new ArrayList<>();
        double somador = 0;

        medias.add(8.2);
        medias.add(6.8);
        medias.add(10.0);
        medias.add(7.3);

        for(int i = 0; i < medias.size(); i++) {
            somador  += medias.get(i);
        }

        double mediaTurma = somador / medias.size();

        System.out.println("Média da turma: " + mediaTurma);

        if (mediaTurma >= 7) {
            System.out.println("A média da turma foi maior que 7");
        } else {
            System.out.println("A média da turma foi menor que 7");
        }

    }
}
