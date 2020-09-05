package com;

import javax.crypto.spec.PSource;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class LinearSearch {
    public static void main(String[] args) {
        String arr[]={"one","two","one","three"};
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        String ele=sc.next();
        for (int i=0;i<arr.length;i++){
            if (ele.equals(arr[i])){
                flag=true;
                break;
            }

        }

        if (!flag)
            System.out.println("element not found "+ele);
       else
            System.out.println("elemt found "+ele);
    }
}
