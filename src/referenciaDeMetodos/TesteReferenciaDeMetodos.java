package referenciaDeMetodos;

import Model.Cliente;
import com.sun.security.ntlm.Client;
import metodosDefault.MostrarClientes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TesteReferenciaDeMetodos {
    public static void main(String[] args) {


        Cliente c1 = new Cliente("marcos", true, "12345");
        Cliente c2 = new Cliente("lucas", true, "12345");
        Cliente c3 = new Cliente("gaby", false, "12345");
        Cliente c4 = new Cliente("ortencia", false, "12345");
        System.out.println(c1.autenticaSenha("12345"));

        List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4);

        clientes.forEach(System.out::println);
        Cliente c5 = new Cliente("lorena", false, "12345");
        Consumer<Cliente> consumidor = Cliente::getNome;
        consumidor.accept(c5);



    }
}