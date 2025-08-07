package modelo.teste.umpramuitos;

import modelo.basico.Produto;
import modelo.infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {
    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Produto produto = new Produto("Celular", 2532.99);
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(pedido, produto, 5);

        dao.abrirTransacao()
                .incluir(produto)
                .incluir(pedido)
                .incluir(item)
                .fecharTransacao()
                .fechar();
    }
}
