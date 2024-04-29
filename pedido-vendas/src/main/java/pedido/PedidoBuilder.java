package pedido;

import Desconto.*;

public class PedidoBuilder {

    private Pedido instancia;

    public PedidoBuilder() {

        CalculadoraFaixaDesconto calculadoraFaixaDesconto = new CalculadoraDescontoTerceiraFaixa(new CalculadoraDescontoSegundaFaixa(
                new CalculadoraPrimeiraFaixaDesconto(new CalculadoraFaixaSemDesconto(null))));

        instancia = new Pedido(calculadoraFaixaDesconto);

    }

    public PedidoBuilder comItem(double valorUnitario, int quantidade) {
        instancia.adicionarItem(new ItemPedido("Gerado pedido", valorUnitario, quantidade));
        return this;

    }

    public Pedido construiur() {
        return instancia;
    }

}
