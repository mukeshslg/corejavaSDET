package com;

import java.util.HashMap;
import java.util.Map;

public class DublicateElementInArray {
    public static void main(String[] args) {
        String arr[]={"one","two","one","three"};
        String dub[] = new String[15];
        int k=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i].equals(arr[j])){
                    dub[k]=arr[i];
                    k++;
                }
            }
        }
        for (String str:dub){
            if (str!=null)
                System.out.println(str);
        }
        /*
        collection approach to count duplicate
         */
        Map<String,Integer> hm=new HashMap<>();
        for (String str:arr){
            if (!hm.containsKey(str)){
                hm.put(str,1);
            }else{
                hm.put(str,hm.get(str)+1);
            }
        }
        System.out.println("Map ele:"+hm);
    }
}
