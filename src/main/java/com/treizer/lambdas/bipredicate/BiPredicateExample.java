package com.treizer.lambdas.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        /*
         * BiPredicate
         * Receive two values and return a boolean (true or false)
         */
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;

        System.out.println(biPredicate.test(5, 3));
    }

}
