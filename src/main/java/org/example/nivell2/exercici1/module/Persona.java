package org.example.nivell2.exercici1.module;


public class Persona {
    private String nom;
    private String cognom;
    private int edat;

    public Persona(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", edat=" + edat +
                '}';
    }
}

