package br.ufg.com.Sistema_pedidos.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.ufg.com.Sistema_pedidos.Produto.Produto;
import br.ufg.com.Sistema_pedidos.Produto.ProdutoFileReader;

@RestController
public class ProdutoController {
    private String produtoPath = "src\\produtos.txt";

    public String hello() {
        return "aula teste";
    }

    public List<Produto> getProdutos() {
        List<Produto> produtos = ProdutoFileReader.lerArquivo(this.produtoPath);
        return produtos;
    }

    public Produto getProdutoId(int id) {
        for(Produto produto : this.getProdutos()){
            if(produto.getId() == id){
                return produto;
            }
        }
        return null;
    }
}
