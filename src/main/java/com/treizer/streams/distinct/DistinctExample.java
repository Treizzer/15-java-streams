package com.treizer.streams.distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Hugo", "Hugo", "Hugo", "Karla", "Zoe");

        // Elimina los elementos duplicados.
        // distinct(): Remove duplicate items.
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }

}
