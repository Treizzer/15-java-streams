package com.treizer.streams.filter;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victoria", "Karla", "Zoe");

        // filter(): Filter items that meet a condition
        names.stream()
                .filter((name) -> name.length() > 4)
                .forEach(System.out::println);
    }

}
