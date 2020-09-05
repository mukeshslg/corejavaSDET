package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChkArrayEqual {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {1, 2, 3, 4};
        Boolean res = Arrays.equals(a, b);
        System.out.println(res);
        /*
        using List
         */
        String al[] = {"1", "2", "3", "4"};
        String bl[] = {"1", "2", "4", "3"};

        List<String> str1 = Arrays.asList(al);
        List<String> str2 = Arrays.asList(bl);
        System.out.println("compare  using equal:"+str1.equals(str2));
        /*
        To find arrays/list equal just sort and chk equal
         */
        Collections.sort(str2);

        System.out.println("compare  using equal after sorting:"+str1.equals(str2));






    }
}
