package com.treizer.streams.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hugo", "Paco", "Luis", "Victoria", "Karla", "Zoe");

        // Aplica una acción a cada elemento.
        // forEach(): Apply an action for each item.
        names.stream()
                .forEach((name) -> {
                    // You can do anything here
                    System.out.println(name);
                });
    }

}
