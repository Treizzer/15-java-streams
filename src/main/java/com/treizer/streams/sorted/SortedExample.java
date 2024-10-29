package com.treizer.streams.sorted;

import java.util.Arrays;
import java.util.List;

public class SortedExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victoria", "Karla", "Zoe");

        // Ordena los elementos del stream.
        // sorted(): Order items of stream.
        names.stream()
                .sorted()
                .forEach(System.out::println);
    }

}
