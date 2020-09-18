package com;

public class dummyTummy {

    static int ivariable=100;
    int xvariable=100;
    private static dummyTummy instance_var=null;

    private dummyTummy() {

    }

    /*
    single ton
     */
    public static dummyTummy getInstance(){
        if (instance_var==null)
            instance_var=new dummyTummy();
        return instance_var;
    }
    public static void main(String[] args) {
        System.out.println("kjs" instanceof String);
        System.out.println("helloworld".substring(2,5));
        Boolean v=Boolean.parseBoolean("FalSe");
        System.out.println(v);
        // main(null);
        //throw new Error();
        String h="Hello";
        System.out.println("hello".getClass());


        System.out.println(dummyTummy.getInstance());
    }
}
