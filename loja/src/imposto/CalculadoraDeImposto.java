package loja.src.imposto;

import loja.src.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        switch (tipoImposto) {
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.1"));

            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.05"));

            default:
                return BigDecimal.ZERO;
        }

    }
}
