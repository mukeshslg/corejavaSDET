package featurefrom8;

import java.util.function.Function;

public class Funtion_PredefineFuncInterf {
    /**
     2. Funtion: apply() method->return single value/type. Used to do some operation & get some value.
     */
    public static void main(String[] args) {
        Function<Integer,Integer> f=n->n*n;//sending sigle arg and returning , both INteger type
        System.out.println(f.apply(5));
    }

    /**
     * TODO: Function chaining, andThen(), compose()..
     */
}
