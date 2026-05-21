import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangsOn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> listaLivros = new ArrayList<>();
        int operador, livroEscolhido, indice;

        do {
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");


            System.out.println("Digite o valor da operação desejada: ");
            operador = sc.nextInt();
            
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
                    livroEscolhido = sc.nextInt();
                    indice = livroEscolhido - 1;

                    if (listaLivros.get(indice).getDisponivel() == true) {
                        listaLivros.get(indice).setDisponivel(false);
                        System.out.println("Livro " + listaLivros.get(indice).getTitulo() + " foi emprestado.");
                    } else {
                        System.out.println("o livro " + listaLivros.get(indice).getTitulo() + " não está disponível." );
                    }

                    break;
                
                case 4:
                    System.out.println("Código do Livro você deseja devolver: ");
                    livroEscolhido = sc.nextInt();
                    indice = livroEscolhido - 1;

                    if (listaLivros.get(indice).getDisponivel() == false) {
                        listaLivros.get(indice).setDisponivel(true);
                        System.out.println("Livro " + listaLivros.get(indice).getTitulo() + " foi desolvido.");
                    } else {
                        System.out.println("o livro " + listaLivros.get(indice).getTitulo() + " não está emprestado." );
                    }

                    break;

            
                default:
                    break;
            }

        } while (operador != 0);

        sc.close();

    }


}
