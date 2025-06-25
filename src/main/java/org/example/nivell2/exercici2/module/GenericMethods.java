package org.example.nivell2.exercici2.module;



public class GenericMethods {
    public static <T> void imprimirArguments(String fixedArg, T... args) {
        System.out.println("Argument fix (String): " + fixedArg);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument variable " + (i + 1) + ": " + args[i]);
        }
    }
}
