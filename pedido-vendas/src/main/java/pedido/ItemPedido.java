package pedido;


public class ItemPedido {
    private String desdcricao;
    private double valorUnitario;
    private int quantidade;

    public ItemPedido(String desdcricao, double valorUnitario, int quantidade) {
        this.desdcricao = desdcricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getDesdcricao() {
        return desdcricao;
    }

    public void setDesdcricao(String desdcricao) {
        this.desdcricao = desdcricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}