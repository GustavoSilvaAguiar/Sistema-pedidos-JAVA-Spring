package br.ufg.com.Sistema_pedidos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.ufg.com.Sistema_pedidos.Cliente.Cliente;
import br.ufg.com.Sistema_pedidos.Controller.ClienteController;

@SpringBootTest
public class CLienteTests {
        private final ClienteController clienteController = new ClienteController();

    @Test
    void getCliente() {
        List<Cliente> clientes = clienteController.getCliente();

         // Verificar os resultados
        assertNotNull(clientes);
        //assertEquals(List<Cliente>, clientes);
    }

    @Test
    void getClienteId() {
        Cliente cliente = clienteController.getClienteId(1);

        // Verificar os resultados
        assertNotNull(cliente);
        assertEquals(1, cliente.getId());
    }
    
}
