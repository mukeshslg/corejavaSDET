package featurefrom8;

import java.util.function.Predicate;

interface preDefFunction{

}
public class PredifineFunctions {
    /**
     predefine functional interface in java8:
     1. Predicate: java.util.function Package, has test method takes 1arg and return boolean; Used when u have conditional chks.
     use test() --->returns boolean;
     2. Funtion: apply() method->return single value/type. Used to do some operation & get some value.

     3. Consumer
     4. Supplier
     */
    public static void main(String[] args) {
        Predicate<Integer> predicate=i->(i>5);
        System.out.println(predicate.test(6));
        /**
         * Example:
        Employee emp=new Employee(3000,"john","hkwjefk@jj.com");
        Predicate<Employee> predicate1=e->(e.salary>3000 && e.salary<9000);
        predicate1.test(emp);*/

    }
}
