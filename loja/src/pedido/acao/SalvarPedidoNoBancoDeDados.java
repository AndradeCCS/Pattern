package loja.src.pedido.acao;

import loja.src.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando Pedido no Banco De Dados!");
    }
}
