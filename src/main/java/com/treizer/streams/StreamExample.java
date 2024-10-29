package com.treizer.streams;

import java.util.Arrays;
import java.util.List;

// Stream -> Flujo de datos
public class StreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victoria", "Karla", "Zoe");

        names.stream()
                .forEach((name) -> System.out.println(name));
    }

}
