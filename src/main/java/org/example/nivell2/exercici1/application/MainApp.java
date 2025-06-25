package org.example.nivell2.exercici1.application;


import org.example.nivell2.exercici1.module.GenericMethods;
import org.example.nivell2.exercici1.module.Persona;

public class MainApp {
    public void executeProgram() {
        Persona persona = new Persona("Anna", "Serra", 30);
        int numero = 42;
        String missatge = "Hola món";

        // Llamadas válidas con diferentes tipos
        GenericMethods.imprimirArguments(persona, missatge, numero);
        GenericMethods.imprimirArguments(numero, missatge, persona);
    }
}