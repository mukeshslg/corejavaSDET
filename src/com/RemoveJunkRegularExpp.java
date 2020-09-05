package com;

public class RemoveJunkRegularExpp {
    public static void main(String[] args) {
        String str="here is java 7 regulax expression @ test rem?/.,ove speci(al character";
        /*
        \\s+ remove multiple spaces
        ^ -->except whats in [ ]
         */
        str=str.replaceAll("[^a-zA-Z0-9@\\s]","");
        System.out.println(str);
    }
}
