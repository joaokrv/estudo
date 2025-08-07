package modelo.teste.basico;

import modelo.basico.Produto;
import modelo.infra.DAO;

public class NovoProduto {
    public static void main(String[] args) {

        Produto produto = new Produto("Celular", 989.55);

        DAO< Produto> dao = new DAO<>(Produto.class);

        dao.abrirTransacao().incluir(produto).fecharTransacao().fechar();
    }
}
