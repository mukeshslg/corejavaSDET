package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class maxMin {

    public static void main(String[] args) {
//int x=(Integer)null;
//        System.out.println(x)
        Integer x=null;
        System.out.println(x);
        System.out.println(fact(5));


//        Map<Integer,String> m=new HashMap<>();
//        m.put(new Integer(1),"blue");
//        m.put(new Integer(1),"bldsue");
//        System.out.println(m.get(1));
//        List<Integer> ls1 = new ArrayList(Arrays.asList(1, 2, 3, 5, 6));
//        List<Integer> ls2 = new ArrayList(Arrays.asList(1, 2, 4));
//        /*
//        using Collections
//         */
//        int mx = Collections.max(ls1);
//        System.out.println(mx);
//
//        /*
//        maximum using loop
//         */
//        int a[] = {1, 2, 3, 4, 23, 6};
//        int max=a[0];
//        for (int i=0;i<a.length;i++){
//            if (a[i]>max){
//                max=a[i];
//            }
//        }
//        System.out.println("Max:"+max);
//        /*
//        minimum using loop
//         */
//       int min=a[0];
//        for (int i=0;i<a.length;i++){
//            if (a[i]<min){
//                min=a[i];
//            }
//        }
//        System.out.println("Min:"+min);
    }


   static long fact(int n){
        if (n==1)
            return 1;
        return n*fact(n-1);
    }
}
