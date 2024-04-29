package pedido;


import Exceptions.QuantidadedeItensInvalidaException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PedidoTest {

    private PedidoBuilder pedido;

    @Before
    public void initBefore() {
        pedido = new PedidoBuilder();

    }


    private void ResumoPedido(double valor_esperado, double valor_desconto) {
        ResumoPedido resumoPedido = pedido.construiur().resumo();
        assertEquals(new ResumoPedido(valor_esperado, valor_desconto), resumoPedido);

    }

    @Test
    public void deve_Calcular_Valor_Total_e_Desconto_Pedido_Vazio() {
        ResumoPedido(0.0, 0.0);

    }

    @Test
    public void deve_Calucluar_Resumo_Para_Um_Item_Sem_Desconto() {
        pedido.comItem(5.0, 5);
        ResumoPedido(25.0, 0.0);
    }

    @Test
    public void Deve_Calcular_Resumo_Para_Dois_Item_Sem_Descoto() {
        pedido.comItem(3.0, 3).comItem(7.0, 3);

        ResumoPedido(30.0, 0.0);
    }

    @Test
    public void Deve_Aplicar_Desconto_Na_Primeira_Faixa() {
        pedido.comItem(20.0, 20);
        ResumoPedido(400.0, 16.0);
    }

    @Test
    public void Deve_Aplicar_Desconto_Na_Segunda_Faixa() {
        pedido.comItem(15.0, 30).comItem(15.0, 30);


        ResumoPedido(900.0, 54.0);

    }

    @Test
    public void Deve_Aplicar_Desconto_na_Terceira_Faixa() {
        pedido.comItem(15.0, 30).comItem(15.0, 30).comItem(10.0, 30);

        ResumoPedido(1200.0, 96.0);

    }

    @Test(expected = QuantidadedeItensInvalidaException.class)
    public void nao_aceitar_pedidos_com_quantidades_negativas() {
        pedido.comItem(0.0, -12);

    }
}