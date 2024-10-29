package com.treizer.lambdas.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        /*
         * BiFunction
         * Receive two values and return a value or result.
         */
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;

        System.out.println(biFunction.apply(5, 3));
    }

}
