package com;

public class StringExample {
    public static void main(String[] args) {
        /*
        same logic below:
        StringBuilder sb=new StringBuilder();
        sb.append(s2);
        sb.reverse();
         */
        String s="Hello this is core java concept for test J";
        String rev="";
        String str[]=s.split("");
        for (int i=str.length-1;i>=0;i--){
            rev=rev+str[i]+"";
        }
        System.out.println(rev);
        /*
        reverse word only
        1 way is using stringgBuilder and reverse-->then print in reverse order-->ill get word reverse
        else
        below approach
         */
        String s2="Hello this is core java concept for test J";
        String reverse="",revs="";
        String str2[]=s2.split(" ");
        for (String val:str2) {
            //String strRev[]=val.split("");//this is also another approach
            for (int i=val.length()-1;i>=0;i--) {
                reverse = reverse + val.charAt(i);
            }
            revs=revs+reverse+" ";
            reverse="";
        }
        System.out.println(revs);
    }
}
