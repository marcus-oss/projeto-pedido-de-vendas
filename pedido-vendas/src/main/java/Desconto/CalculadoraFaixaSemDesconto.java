package Desconto;

public class CalculadoraFaixaSemDesconto extends CalculadoraFaixaDesconto {
    public CalculadoraFaixaSemDesconto(CalculadoraFaixaDesconto proximo) {
        super(proximo);
    }


    @Override
    protected double calcular(double valorTotal) {
        return 0;
    }
}
