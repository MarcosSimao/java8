package optional.repository;

import optional.model.Caminhao;
import optional.model.Motorista;
import optional.model.Seguro;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Motoristas {
    private Map<String, Optional<Motorista>> motoristas= new HashMap<>();

    public Motoristas(){
        Seguro seguro = new Seguro("PArcial - não cobre roubo",new BigDecimal("5000"));
        Caminhao caminhao = new Caminhao("Mercedes Atron",Optional.ofNullable(seguro));
       Optional<Motorista> motoristaJoao = Optional.of(new Motorista("Joao",40,Optional.ofNullable(caminhao)));

        Optional<Motorista> motoristaJose = Optional.of(new Motorista("Jose",25,Optional.ofNullable(null)));

        motoristas.put("Joao",motoristaJoao);
        motoristas.put("Jose",motoristaJose);



    }
    public Optional<Motorista> porNome(String nome){
        return motoristas.get(nome);
    }

}
