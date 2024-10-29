package com.treizer.lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        /*
         * Biconsumer
         * Receive two values and doesn't return something
         */
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("\n" + a + " " + b);
        biConsumer.accept("Hola", "Mundo");
    }

}
