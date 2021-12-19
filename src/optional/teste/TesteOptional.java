package optional.teste;

import optional.model.Seguro;

import java.math.BigDecimal;
import java.util.Optional;

public class TesteOptional {

    public static void main(String [] args){
        Seguro seguro = new Seguro("Total com franquia reduzida",new BigDecimal("600"));
     // caso vc baio tenha certeza que o valor venmha nulo ou nao
        Optional<Seguro> seguroOptional = Optional.ofNullable(null);
        seguroOptional.map(Seguro::getValorFranquia).ifPresent(System.out::println);
       //  System.out.println(seguroOptional.map(Seguro::getCobertura).orElse("nao encontrou"));




    }
}
