package com.treizer.streams.skip;

import java.util.Arrays;
import java.util.List;

public class SkipExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victori", "Karla", "Zoe");

        // Omite un número específico de elementos.
        // skip(): Skip a specified number of elements.
        names.stream()
                .skip(3) // Quantity of elements to skip
                .forEach(System.out::println);
    }

}
