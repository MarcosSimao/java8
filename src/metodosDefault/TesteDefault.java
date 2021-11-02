package metodosDefault;

import Model.Cliente;

import java.util.Arrays;
import java.util.List;


public class TesteDefault {
    public static void main(String[] args) {


        Cliente c1 = new Cliente("marcos", true, "12345");
        Cliente c2 = new Cliente("lucas", true, "12345");
        Cliente c3 = new Cliente("gaby", false, "12345");
        Cliente c4 = new Cliente("ortencia", false, "12345");
        System.out.println(c1.autenticaSenha("12345"));

        List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4);
        MostrarClientes mc = new MostrarClientes();
        clientes.forEach(mc);
//        for(Cliente c: clientes){
//            System.out.println(c.getNome());
//            System.out.println(c.getSenha());
//        }
    }
}