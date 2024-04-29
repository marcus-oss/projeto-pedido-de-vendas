package pedido;

import Desconto.CalculadoraFaixaDesconto;
import Exceptions.QuantidadedeItensInvalidaException;

import java.util.ArrayList;
import java.util.List;

public class Pedido {


    private List<ItemPedido> item = new ArrayList<>();
    private CalculadoraFaixaDesconto calculadoraFaixaDesconto;

    public Pedido(CalculadoraFaixaDesconto calculadoraFaixaDesconto) {
        this.calculadoraFaixaDesconto = calculadoraFaixaDesconto;
    }

    public void adicionarItem(ItemPedido itemPedido) {
        if (itemPedido.getQuantidade() < 0) {
            throw new QuantidadedeItensInvalidaException();
        }

        item.add(itemPedido);

    }


    public ResumoPedido resumo() {
        double valorTotal = item.stream().mapToDouble(i -> i.getValorUnitario() * i.getQuantidade()).sum();
        double valorDesconto = calculadoraFaixaDesconto.desconto(valorTotal);


        return new ResumoPedido(valorTotal, valorDesconto);
    }


}
