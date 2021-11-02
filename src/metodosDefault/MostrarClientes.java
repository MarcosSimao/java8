package metodosDefault;

import Model.Cliente;

import java.util.function.Consumer;

public class MostrarClientes implements Consumer<Cliente> {
    @Override
    public void accept(Cliente cliente) {
        System.out.println(cliente.getNome());
        System.out.println(cliente.getSenha());
    }
}
