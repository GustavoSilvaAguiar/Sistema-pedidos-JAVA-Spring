package br.ufg.com.Sistema_pedidos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.ufg.com.Sistema_pedidos.Controller.ProdutoController;
import br.ufg.com.Sistema_pedidos.Produto.Produto;

@SpringBootTest
public class ProdutoTests {
    private final ProdutoController produtoController = new ProdutoController();

    @Test
    void getProdutos() {
        List<Produto> produtos = produtoController.getProdutos();

        assertNotNull(produtos);
    }

    @Test
    void getProdutoId() {
        Produto produto = produtoController.getProdutoId(1);

        assertNotNull(produto);
        assertEquals(1, produto.getId());
    }
}
