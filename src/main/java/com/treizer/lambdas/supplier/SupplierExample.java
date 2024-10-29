package com.treizer.lambdas.supplier;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        /*
         * Supplier
         * Doesn't receive value, but return something
         */
        Supplier<String> supplier = () -> "Hola, soy un Supplier";

        System.out.println(supplier.get());
    }

}
