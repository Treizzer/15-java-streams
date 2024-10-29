package com.treizer.lambdas.function;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        /*
         * Function
         * Receive a value and return a value or result.
         */
        Function<Integer, String> function = (num) -> "El número es: " + num;

        System.out.println(function.apply(5));
    }

}
