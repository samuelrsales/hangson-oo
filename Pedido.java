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

    public String getStatus() {
        return this.statusPedido;
    }

    public void setStatus(String status) {
            this.statusPedido = status;
    }

    public int getNumeroPedido() {
        return this.numeroPedido;
    }

    public double getValorPedido() {
        return this.valorPedido;
    }
    
    public String toString() {
        return this.numeroPedido + " | " + this.nomeCliente + " | " + this.itemPedido + " | " + this.valorPedido + " | " + this.statusPedido;
    }
}
