package reducer;

import java.sql.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Reducer {

    public static void main(String ... args){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        Optional<Integer> reducer=list.stream().reduce((n1, n2)->n1+n2);
        System.out.println(reducer);


    }
}
