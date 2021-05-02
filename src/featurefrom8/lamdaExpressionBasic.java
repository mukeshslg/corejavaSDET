package featurefrom8;
@FunctionalInterface
interface  LamdaInerface{
void displayLamdaString(String nameString);


}
public class lamdaExpressionBasic { // implements LamdaInerface  <<=== no need to implement

        /**
         lamda expression is Ananemous function removes access specifier, method name ,return type

         Interface can have:
         abstract methods: was already der
         default methods: new from java8
         static methods: new from java8

         Functional Interface:
       **abstract methods: can only one, STRICT <<==
         default methods: any number
         static methods: any number
         example of func Interface: Runnable/Comparable

         note: to invoke lamda expression --> functional interface required
         */

    /**
     predefine functional interface in java8:
     1. Predicate: java.util.function Package, has test method takes 1arg and return boolean; Used when u have conditional chks.
     2. Funtion
     3. Consumer
     4. Supplier
     */


    public static void main(String[] args) {
        LamdaInerface met= (nameStr)-> System.out.println("Hello from java lamda expression"+nameStr);
        met.displayLamdaString(" In java 8 ");
    }



}
