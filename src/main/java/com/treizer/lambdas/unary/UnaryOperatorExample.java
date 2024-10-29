package com.treizer.lambdas.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        /*
         * UnaryOperator
         * Receive a value, do process and return a result of the same type.
         */
        UnaryOperator<Integer> unaryOperator = (number) -> number * number;

        System.out.println(unaryOperator.apply(5));
    }

}
