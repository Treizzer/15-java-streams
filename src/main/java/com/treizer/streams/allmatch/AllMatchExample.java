package com.treizer.streams.allmatch;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victori", "Karla", "Zoe");

        // Verifica si todos los elementos cumplen una condición.
        // allMatch(): Check if all elements meet a condition.
        boolean result = names.stream()
                .allMatch((name) -> name.startsWith("H"));

        System.out.println(result);
    }

}
