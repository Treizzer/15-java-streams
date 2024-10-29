package com.treizer.lambdas.runnable;

public class RunnableExample {

    public static void main(String[] args) {
        /*
         * Runnable
         * Doesn't receive values and doesn't return something, only execute tasks.
         */
        Runnable runnable = () -> System.out.println("Ejecutando tarea...");

        runnable.run();
    }

}
