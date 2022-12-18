package loja;

import loja.src.pedido.GeraPedido;
import loja.src.pedido.GeraPedidoHandler;
import loja.src.pedido.acao.EnviarEmailPedido;
import loja.src.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {

        /*String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);*/

        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                new EnviarEmailPedido()
                )
        );
        handler.execute(gerador);
    }

}
