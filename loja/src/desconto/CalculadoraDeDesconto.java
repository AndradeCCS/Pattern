package loja.src.desconto;

import java.math.BigDecimal;
import loja.src.orcamento.Orcamento;

public class CalculadoraDeDesconto {
    public CalculadoraDeDesconto() {
    }

    public BigDecimal calcular (Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }

}
