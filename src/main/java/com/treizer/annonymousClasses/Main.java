package com.treizer.annonymousClasses;

public class Main {
    public static void main(String[] args) {
        // Animal dog = new Animal() {
        // @Override
        // public void doNoise() {
        // System.out.println("Hola Yo ladro Guau");
        // }
        // };
        // dog.doNoise();

        new Vehicle() {
            private int numPassangers;

            public void drive() {
                System.out.println("Estoy manejando");
            }

        }.drive();
    }
}
