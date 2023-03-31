package org.example;

public class ZeroTwoArgument {

    public interface ZeroArgument {
        public void myFunc();
    }

    public static void printZero(ZeroArgument z0) {
        z0.myFunc();
    }

    public interface TwoArgument {
        public int myFunc(int a, int b);
    }

    public static void main(String[] args) {
        ZeroArgument z = () -> System.out.println("hello walde");
        printZero(z);
        System.out.println(z);
        TwoArgument to = (x,y) -> x+y;
        int i2 = to.myFunc(5,6);
        System.out.println(i2);
    }

}
