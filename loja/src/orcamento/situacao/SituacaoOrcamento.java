package loja.src.orcamento.situacao;

import loja.src.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
    public BigDecimal calcularValorDescontoExtra (Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("orçamaneto não pode ser APROVADO!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("orçamaneto não pode ser REPROVADO!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("orçamaneto não pode ser FINALIZADO!");
    }

}
