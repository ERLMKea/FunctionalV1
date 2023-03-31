package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        toUpper.accept("viggo");
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> out = (x) -> System.out.println(x);

        


    }

}

