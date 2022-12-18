package loja.src.pedido;

import loja.src.orcamento.Orcamento;
import loja.src.pedido.acao.AcaoAposGerarPedido;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    //construtor com injeção d edepêndencias: repository, service...
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute (GeraPedido dados){
      Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
      Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

      acoes.forEach(a -> a.executarAcao(pedido));

   }
}
