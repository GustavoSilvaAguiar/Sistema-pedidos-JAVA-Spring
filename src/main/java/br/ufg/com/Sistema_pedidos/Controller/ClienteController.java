package br.ufg.com.Sistema_pedidos.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import br.ufg.com.Sistema_pedidos.Cliente.Cliente;
import br.ufg.com.Sistema_pedidos.Cliente.ClienteFileReader;;

@RestController
public class ClienteController {
    private String clientesPath = "src\\clientes.txt";

    public List<Cliente> getCliente() {
        List<Cliente> clientes = ClienteFileReader.lerArquivo(this.clientesPath);
        return clientes;
    }

    public Cliente getClienteId(int id) {
        for(Cliente cliente : this.getCliente()){
            if(cliente.getId() == id){
                return cliente;
            }
        }
        return null;
     }

    
}
