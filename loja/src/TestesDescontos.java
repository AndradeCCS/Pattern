import desconto.CalculadoraDeDescontos;
import imposto.CalculadoraDeImposto;
import imposto.TipoImposto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),10);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("600"),1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(orcamento));
        System.out.println(calculadora.calcular(orcamento2));

    }
}
