package com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingElement {
    public static void main(String[] args) {
        int[] a={12,1,34,22,344,232,999,888};
//        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
//        Arrays.parallelSort(a);
        System.out.println(Arrays.toString(a));
        Integer[] x={12,1,34,22,344,232,999,888};
        Arrays.sort(x,Collections.reverseOrder());
        System.out.println(Arrays.toString(x));

    }
}
