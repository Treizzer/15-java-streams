package com.treizer.streams.limit;

import java.util.Arrays;
import java.util.List;

public class LimitExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victoria", "Karla", "Zoe");

        // Limita el número de elementos procesados.
        // limit(): Limits the number of items processed.
        names.stream()
                .limit(3)
                .forEach(System.out::println);
    }

}
