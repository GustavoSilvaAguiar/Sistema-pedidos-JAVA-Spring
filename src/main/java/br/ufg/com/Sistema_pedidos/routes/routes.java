package br.ufg.com.Sistema_pedidos.routes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.ufg.com.Sistema_pedidos.Cliente.Cliente;
import br.ufg.com.Sistema_pedidos.Controller.ClienteController;
import br.ufg.com.Sistema_pedidos.Controller.ProdutoController;
import br.ufg.com.Sistema_pedidos.Produto.Produto;

@RestController
public class routes {
    private final ProdutoController produtoController = new ProdutoController();
    private final ClienteController clienteController = new ClienteController();

    @GetMapping("/")
    public String home() {
        return this.produtoController.hello();
    }

    @GetMapping("/produtos")
    public List<Produto> geProdutos() {
        return this.produtoController.getProdutos();
    }

    @GetMapping("/produtos/{id}")
    public Produto getProdutosId(@PathVariable(value = "id") int id) {
        System.out.println("null");
        return this.produtoController.getProdutoId(id);
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        return this.clienteController.getCliente();
    }

    @GetMapping("/clientes/{id}")
    public Cliente getCLienteId(@PathVariable(value = "id") int id) {
        System.out.println("null");
        return this.clienteController.getClienteId(id);
    }
}
