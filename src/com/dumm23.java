package com;

import java.util.ArrayList;
import java.util.List;

public class dumm23 {

    public static String solution(String S, int K) {
        List<String> dy=new ArrayList<String>(){
            {
                add("Mon");
                add("Tue");
                add("Wed");
                add("Thu");
                add("Fri");
                add("Sat");
            }
        };
        int indx=dy.indexOf(S);
        return dy.get((indx+K)%7);
    }
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s1==s2);
        System.out.println(dumm23.solution("Wed",2));


    }

}
