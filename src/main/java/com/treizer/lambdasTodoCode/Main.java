package com.treizer.lambdasTodoCode;

import com.treizer.lambdasTodoCode.logic.IMessenger;

public class Main {
    public static void main(String[] args) {
        IMessenger lambdMessage = (name, age) -> {
            System.out.println("Hola desde lambda " + name);
            System.out.println("Su edad es: " + age);
        };

        lambdMessage.sendMessage("Hugo", (byte) 33);
    }
}
