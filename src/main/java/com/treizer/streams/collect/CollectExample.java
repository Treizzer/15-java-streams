package com.treizer.streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victoria", "Karla", "Zoe");

        // Recoge los elementos en una colección.
        // collect(): Collect the items in a collection.
        List<String> results = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        results.stream()
                .forEach(System.out::println);
    }

}
