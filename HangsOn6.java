import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangsOn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> listaLivros = new ArrayList<>();
        int operador;

        do {
            operador = sc.nextInt();

            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");

            switch (operador) {
                case 1:
                    listaLivros.add(new Livro(1, "Pai Rico, Pai Pobre", "Robert Kiyosaki", true));
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    for(Livro livro: listaLivros) {
                        System.out.println(livro);
                    }
                    break;

                case 3:
                    System.out.println("Código do Livro você deseja emprestar: ");
                    int livroEmprestado = sc.nextInt();

                    break;
            
                default:
                    break;
            }

        } while (operador != 0);

    }


}
