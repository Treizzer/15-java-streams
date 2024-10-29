package com.treizer.streams.map;

import java.util.Arrays;
import java.util.List;

public class MapExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victoria", "Karla", "Zoe");

        // Transforma los elementos aplicando una función.
        // Function: receive a value and return a value.
        // map(): Transform items applying a function.
        names.stream()
                // .map((name) -> name.toUpperCase())
                .map(String::toUpperCase)
                .filter((name) -> name.endsWith("O"))
                .forEach(System.out::println);
    }

}
