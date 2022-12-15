package loja.src;

import loja.src.imposto.CalculadoraDeImposto;
import loja.src.imposto.TipoImposto;
import loja.src.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));
    }
}
