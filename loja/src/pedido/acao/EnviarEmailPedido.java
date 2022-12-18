package loja.src.pedido.acao;

import loja.src.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("E-mail enviado com dados do Pedido!");
    }
}
