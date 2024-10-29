package com.treizer.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        /*
         * Predicate
         * Receive a value and return a boolean (true or false)
         */
        Predicate<String> predicate = (str) -> str.length() > 5;

        System.out.println(predicate.test("Hola Mundo"));
    }

}
