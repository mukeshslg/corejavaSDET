package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maxMin {

    public static void main(String[] args) {
        List<Integer> ls1 = new ArrayList(Arrays.asList(1, 2, 3, 5, 6));
        List<Integer> ls2 = new ArrayList(Arrays.asList(1, 2, 4));
        /*
        using Collections
         */
        int mx = Collections.max(ls1);
        System.out.println(mx);

        /*
        maximum using loop
         */
        int a[] = {1, 2, 3, 4, 23, 6};
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max:"+max);
        /*
        minimum using loop
         */
       int min=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Min:"+min);
    }
}
