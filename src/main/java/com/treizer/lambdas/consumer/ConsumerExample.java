package com.treizer.lambdas.consumer;

import java.util.function.Consumer;

// First
public class ConsumerExample {

    public static void main(String[] args) {
        /*
         * Consumer
         * Receive a value and doesn't return something
         */
        // Consumer<String> consumer = param -> System.out.println("\n" + param);
        Consumer<String> consumer = System.out::println;

        consumer.accept("Hugo");
    }

}