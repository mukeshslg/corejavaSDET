package com;

public class OuterInnerClass {
    private int num = 175;
    private  class InnerClass{//inner class can be private
        void displayInner(){
            System.out.println("Inner class display method");
        }
    }
    void displayOuter(){
        System.out.println("Outer class display method");
    }

    public static void main(String[] args) {
        OuterInnerClass oc=new OuterInnerClass();
        OuterInnerClass.InnerClass ic=oc.new InnerClass();
        oc.displayOuter();
        ic.displayInner();

    }
}
