package com.examples.streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(11);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(7);

        System.out.println("original List: " + list);

        Stream<Integer> stream = list.stream();
        // Obtain the min, max by using min(), max(), get(), isPresent()
        Optional<Integer> min = stream.min(Integer::compare);
        if(min.isPresent()) System.out.println("Minimum Value: " + min.get());

        // Must obtain the new stream because previous call to min() is terminal operation that consumed the stream.
        stream = list.stream();
        Optional<Integer> max = stream.max(Integer::compare);
        if(max.isPresent()) System.out.println("Maximum Value: " + min.get());

        // Sort stream by the use of sorted
        Stream<Integer> sorted = list.stream().sorted();

        // Display the stream by the use of forEach()
        System.out.println("Sorted Stream: ");
        sorted.forEach((n) -> System.out.println(n + " "));
        System.out.println();

        // Display only odd values by using filter()
        Stream<Integer> oddValues = list.stream().filter(n -> n % 2 != 0);
        System.out.println("Odd values: ");
        oddValues.forEach((n) -> System.out.println(n + " "));
        System.out.println();

        // Display only odd values by using filter(). filter chain
        Stream<Integer> oddValuesGT5 = list.stream().filter(n -> n % 2 != 0).filter(n -> n>5);
        System.out.println("Odd values: ");
        oddValuesGT5.forEach((n) -> System.out.println(n + " "));
        System.out.println();
    }
}
