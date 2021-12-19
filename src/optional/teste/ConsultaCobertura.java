package optional.teste;


import optional.model.Caminhao;
import optional.model.Motorista;

import optional.model.Seguro;
import optional.repository.Motoristas;

import java.util.Optional;

public class ConsultaCobertura {

    public static void main(String[] args) {
        Motoristas motoristas = new Motoristas();
        //Optional<Motorista> motorista = motoristas.porNome("Joao");

//        String cobertura = "sem seguro";
//        if (motorista != null) {
//            Caminhao caminhao = motorista.getCaminhao();
//            if (caminhao != null) {
//                Seguro seguro = caminhao.getSeguro();
//                if (seguro != null) {
//                    cobertura = seguro.getCobertura();
//                }
//            }
//
//        }
       String cobertura =motoristas.porNome("marcos")
               .flatMap(Motorista::getCaminhao)
               .flatMap(Caminhao::getSeguro)
               .map(Seguro::getCobertura)
               .orElseThrow(()-> new NullPointerException("nome nao encontrado"))
               ;

        System.out.println(cobertura);

        //System.out.println(cobertura);
    }
}
