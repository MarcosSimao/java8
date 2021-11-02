package lambdas;

import Model.Cliente;


import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteLambdas {
    public static void main(String[] args){


        Cliente c1= new Cliente("marcos",true,"12345");
        Cliente c2= new Cliente("lucas",true,"12345");
        Cliente c3= new Cliente("gaby",false,"12345");
        Cliente c4= new Cliente("ortencia",false,"12345");
        System.out.println(c1.autenticaSenha("12345"));

        List<Cliente> clientes= Arrays.asList(c1,c2,c3,c4);
//        Consumer<Cliente> cs = new Consumer<Cliente>() {
//            @Override
//            public void accept(Cliente cliente) {
//                System.out.println(cliente.getNome());
//                System.out.println(cliente.getSenha());
//            }
//        };
        //MostrarClientes mc = new MostrarClientes();
        //Consumer<Cliente> cs=(Cliente c) ->{System.out.println(c.getNome());};
        clientes.forEach((Cliente c) ->{System.out.println(c.getNome());});
        List<Cliente> status=  clientes.stream().filter(x->x.isStatus()==false)
                .collect(Collectors.toList());
        status.forEach( c->{System.out.println(c.getNome());});

    }

}
