public class Pedido {
    int numeroPedido;
    String nomeCliente;
    String itemPedido;
    double valorPedido;
    String statusPedido;

    public Pedido(int numeroPedido, String nomeCliente, String itemPedido, double valorPedido, String statusPedido) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.itemPedido = itemPedido;
        this.valorPedido = valorPedido;
        this.statusPedido = statusPedido;
    }

    
}
