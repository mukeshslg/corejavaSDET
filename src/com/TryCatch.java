package com;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("START");
      /*
      code can have try w/o catch but finally in must in that case
      code will throw  exception on runtime
      and also code after finally will be unreachable

      Conclusion: U can write this below code w/o compilation error but, This way of coding is bad practice.
       */
        try {
            int x=23/0;
            System.out.println("after divisoon error");
            //throw new ArithmeticException();
        } finally {
            System.out.println("Hello this is Finally Block");
        }
       System.out.println("End block");  //code is unreachable
    }
}
