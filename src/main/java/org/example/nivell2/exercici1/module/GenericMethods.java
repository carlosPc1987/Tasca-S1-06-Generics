package org.example.nivell2.exercici1.module;


public class GenericMethods {
    public static <T, U> void imprimirArguments(T arg1, String arg2, U arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2 (String fix): " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}