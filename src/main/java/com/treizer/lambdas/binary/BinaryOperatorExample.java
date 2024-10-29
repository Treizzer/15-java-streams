package com.treizer.lambdas.binary;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        /*
         * BinaryOperator
         * Receive two values of same type and return a same type value.
         */
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

        System.out.println(binaryOperator.apply(10, 20));
    }

}
