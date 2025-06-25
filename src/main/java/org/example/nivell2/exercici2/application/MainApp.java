package org.example.nivell2.exercici2.application;


import org.example.nivell2.exercici1.module.Persona;
import org.example.nivell2.exercici2.module.GenericMethods;

public class MainApp {
    public void executeProgram() {
        Persona persona = new Persona("Anna", "Serra", 30);
        Integer edat = 42;
        Double nota = 9.5;
        Boolean actiu = true;

        GenericMethods.imprimirArguments("Informació:", persona, edat, nota, actiu, "final");
    }
}
