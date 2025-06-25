package org.example.nivell1.exercici1.application;

import org.example.nivell1.exercici1.module.NoGenericMethods;

public class MainApp {
    public void execute() {

        NoGenericMethods exemple = new NoGenericMethods("Barcelona", "València", "Girona");

        System.out.println(exemple.getObj1());
        System.out.println(exemple.getObj2());
        System.out.println(exemple.getObj3());
    }
}