package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DifferenceArray {

    public static void main(String[] args) {
        List<String> ls1=new ArrayList(Arrays.asList("one","two","3","4"));
        List<String> ls2=new ArrayList(Arrays.asList("one","two","4"));
        System.out.println(ls1.equals(ls2));
        System.out.println("Diference:"+ls1.removeAll(ls2));
        System.out.println(" item not present in list2  :"+ls1);
        ls1.clear();
        ls1.addAll(Arrays.asList("one","two","3","4"));

        System.out.println("Find common in both list:"+""+ls1);
        ls1.retainAll(ls2);//find common element
        System.out.println(ls1);

        /*
        chk equal
         */
        ls1.clear();ls2.clear();
        ls1.addAll(Arrays.asList("one","two","3","4"));
        ls2.addAll(Arrays.asList("one","two","4","3"));
        Collections.sort(ls2);
        System.out.println(ls1+"  "+ls2);
        System.out.println(ls1.equals(ls2));

    }
}
