package loja.src.desconto;

import java.math.BigDecimal;
import loja.src.orcamento.Orcamento;
public class CalculadoraDeDesconto {
    public CalculadoraDeDesconto() {
    }
    public BigDecimal calcular (Orcamento orcamento) {
        Desconto cadeiaDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));
        return cadeiaDeDesconto.calcular(orcamento);
    }

}
