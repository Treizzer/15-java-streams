package com.treizer.lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {

    public static void main(String[] args) {
        /*
         * Callable
         * Doesn't receive values, but return a result and can throw an exception.
         * Concurrences
         * Threads
         * Promises
         */
        Callable<String> callable = () -> "Resultado de la tarea";

        try {
            System.out.println(callable.call());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
