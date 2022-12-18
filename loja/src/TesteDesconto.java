package loja.src;

import loja.src.desconto.CalculadoraDeDesconto;
import loja.src.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();

        Orcamento primeiro = new Orcamento(new BigDecimal("200"),6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
