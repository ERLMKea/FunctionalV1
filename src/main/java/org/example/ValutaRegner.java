package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ValutaRegner {

    static void forEachString(List<String> lst, Consumer<String> consumer) {
        for(String s: lst) {
            consumer.accept(s);
        }
    }

    static <T> void forEach(List<T> lst, Consumer<T> consumer) {
        for(T s: lst) {
            consumer.accept(s);
        }
    }

    public interface TwoArgument {
        public int myFunc(int a, int b);
    }

    static int valutaRegner(List<Integer> dollars, TwoArgument two, int kurs) {
        int sum = 0;
        for (int t: dollars) {
            sum += two.myFunc(t, kurs);
        }
        return sum;
    }

    public static void main(String[] args) {
        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        toUpper.accept("viggo");
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> out = (x) -> System.out.println(x);
        List<String> lstStr = Arrays.asList("hej", "du", "der");
        //forEachString(lstStr, toUpper);
        //forEach(list, out);
        lstStr.forEach(toUpper);

        TwoArgument bank = (x,y) -> x*y;
        List<Integer> dollars = Arrays.asList(1,5);
        int penge = valutaRegner(dollars, (x,y) -> x*y ,6);
        System.out.println(penge);

    }


}
