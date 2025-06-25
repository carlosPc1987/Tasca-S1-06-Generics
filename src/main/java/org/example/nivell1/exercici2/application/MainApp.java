package org.example.nivell1.exercici2.application;


import org.example.nivell1.exercici2.module.GenericMethods;
import org.example.nivell1.exercici2.module.Persona;

public class MainApp {
    public void executeProgram() {
        Persona persona = new Persona("Anna", "Serra", 30);
        String text = "Hola món";
        int numero = 42;

        GenericMethods.printArguments(persona, text, numero);
        GenericMethods.printArguments(text, numero, persona);
        GenericMethods.printArguments(numero, persona, text);
    }
}