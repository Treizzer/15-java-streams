package com.treizer.streams.anymatch;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victori", "Karla", "Zoe");

        // Verifica si algún elemento cumple una condición.
        // anyMatch(): Check if any element meets a condition.
        boolean result = names.stream()
                .anyMatch((name) -> name.startsWith("P"));

        System.out.println(result);
    }

}
