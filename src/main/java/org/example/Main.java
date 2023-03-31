package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void g7() {
        List<String> g7 = Arrays.asList("Usa", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        Function<String, String> toUpper = (s) -> s.toUpperCase();
        List<String> g7Upper = g7.stream().map(toUpper).collect(Collectors.toList());
        g7Upper.forEach(System.out::println);
        Function<String, Integer> strLength = (s) -> s.length();
        List<Integer> lstLength = g7.stream().map(strLength).collect(Collectors.toList());
        lstLength.forEach(System.out::println);
    }

    public static void uendelig() {
        Supplier<Double> ran = () -> Math.random();
        Stream<Double> ranNums =Stream.generate(ran);
        ranNums.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Supplier<Double> ran = () -> Math.random();
        Stream<Double> ranNums =Stream.generate(ran);
        Function<Double, Long> dblround = d -> Math.round(d*100);
        Predicate<Long> longEqual = l -> l % 2 == 0;
        Double sumaf12 = Stream.generate(ran)
                .map(dblround)
                .filter(longEqual)
                .limit(12)
                .mapToDouble(d->d)
                .sum();
        System.out.println(sumaf12);
    }
}

