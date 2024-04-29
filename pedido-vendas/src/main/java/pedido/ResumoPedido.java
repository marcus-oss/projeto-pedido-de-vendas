package pedido;

import java.util.Objects;

public class ResumoPedido {

    private double valorTotal;
    private double valorDesconto;

    public ResumoPedido(double valorTotal, double valorDesconto) {
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResumoPedido that = (ResumoPedido) o;
        return Double.compare(valorTotal, that.valorTotal) == 0 && Double.compare(valorDesconto, that.valorDesconto) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valorTotal, valorDesconto);
    }

    @Override
    public String toString() {
        return "ResumoPedido{" +
                "valorTotal=" + valorTotal +
                ", valorDesconto=" + valorDesconto +
                '}';
    }
}
