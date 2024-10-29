package com.treizer.streams.nonematch;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victori", "Karla", "Zoe");

        // Verifica si ningún elemento cumple una condición.
        // noneMacth(): Check if no element meets a condition.
        boolean result = names.stream()
                .noneMatch((name) -> name.length() == 3);

        System.out.println(result);
    }

}
