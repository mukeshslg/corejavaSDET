package featurefrom8;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo_Function_Employee {
    int salary;
    String ename;

    public Demo_Function_Employee(String ename, int salary) {
        this.salary = salary;
        this.ename=ename;
    }

    public static void main(String[] args) {
        ArrayList<Demo_Function_Employee> emp=new ArrayList();
        emp.add(new Demo_Function_Employee("john eon",30000));
        emp.add(new Demo_Function_Employee("Sunny Bos",50000));
        emp.add(new Demo_Function_Employee("Mary eon",20000));
        emp.add(new Demo_Function_Employee("Don Feon",80000));

        Function<Demo_Function_Employee, Integer> fun= em->{
                if (em.salary>30000)
                  return em.salary;

            return -1;
        };

        for (Demo_Function_Employee e:emp){
            int sal=fun.apply(e);
            //using predication to provide check
            Predicate<Integer> predicate=v->(v>30000);
            if (predicate.test(sal)) {
                System.out.println(e.ename);
                System.out.println("Salary -bon:" + sal);
            }
        }

    }
}
