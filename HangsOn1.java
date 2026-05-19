import  java.util.List;
import  java.util.ArrayList;

public class HangsOn1 {
    public static void main(String[] args) {
        List<String> listaCompras = new ArrayList<>();
        
        listaCompras.add("Fuba");
        listaCompras.add("Queijo");
        listaCompras.add("Arroz");
        listaCompras.add("Feijão");
        listaCompras.add("Mussarela");

        for (String a: listaCompras) {
            System.out.println(a);
        }

        System.out.println("Quantidade total de itens: " + listaCompras.size());

    }
}