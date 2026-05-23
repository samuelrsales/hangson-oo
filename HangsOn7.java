import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangsOn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pedido> listaPedidos = new ArrayList<>();
        int operador, codigoPedido;
        boolean encontrado;

        do {
            System.out.println("\n\nLANCHONETE DO SAMUEL\n\n");
            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar status de um pedido");
            System.out.println("4 - Buscar pedido pelo número");
            System.out.println("5 - Mostrar valor total dos pedidos");
            System.out.println("0 - Sair");

            System.out.println("\nDigite o valor da operação: ");
            operador = sc.nextInt();
            sc.nextLine();

            switch (operador) {
                case 1:
                    listaPedidos.add(new Pedido(1, "João", "Coxinha", 25.00, "FINALIZADO"));
                    listaPedidos.add(new Pedido(2, "Maria", "Hamburguer", 70.00, "PENDENTE"));
                    listaPedidos.add(new Pedido(3, "Roberto", "Açai", 30.00, "PREPARANDO"));
                    System.out.println("Pedidos cadastrados com sucesso!");
                    break;

                case 2:
                    System.out.println("\n\nPEDIDOS:");
                    for (Pedido pedido : listaPedidos) {
                        System.out.println(pedido);
                    }
                    break;

                case 3:
                    System.out.println("Digite o código do pedido:");
                    codigoPedido = sc.nextInt();
                    sc.nextLine();
                    encontrado = false;

                    for (int i = 0; i < listaPedidos.size(); i++) {
                        if (codigoPedido == listaPedidos.get(i).getNumeroPedido()) {
                            encontrado = true;
                            System.out.println("Digite o novo status: ");
                            String novoStatus = sc.nextLine();

                            if (novoStatus.equalsIgnoreCase("PENDENTE") || novoStatus.equalsIgnoreCase("PREPARANDO")
                                    || novoStatus.equalsIgnoreCase("FINALIZADO")) {
                                listaPedidos.get(i).setStatus(novoStatus);
                                System.out.println("Status atualizado!");
                            } else {
                                System.out.println("Status inválido.");
                            }
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Código não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o código do pedido:");
                    codigoPedido = sc.nextInt();
                    sc.nextLine();
                    encontrado = false;

                    for (Pedido pedido : listaPedidos) {
                        if (pedido.getNumeroPedido() == codigoPedido) {
                            System.out.println("\nPedido encontrado:");
                            System.out.println(pedido);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Código não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("\n\nVALOR TOTAL DOS PEDIDOS:");
                    
                    double valorTotal = 0.0;

                    for (Pedido pedido : listaPedidos) {
                        valorTotal += pedido.getValorPedido();
                    }

                    System.out.printf("O valor total de todos os pedidos é: R$ %.2f%n", valorTotal);
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (operador != 0);

        sc.close();
    }
}
