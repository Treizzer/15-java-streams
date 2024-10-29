package com.treizer.streams.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victoria", "Karla", "Zoe");

        // Combina todos los elementos en un solo valor.
        // reduce(): Mix all items in only one value.
        String result = names.stream() // Identity empty
                .reduce("Resultado:", (a, b) -> a + " " + b);

        System.out.println(result);
    }

}
