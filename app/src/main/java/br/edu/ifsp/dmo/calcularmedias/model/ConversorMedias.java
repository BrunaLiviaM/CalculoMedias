package br.edu.ifsp.dmo.calcularmedias.model;

// Arquivo ConversorMedias.java

public interface ConversorMedias {
    double calcularMediaAritmetica(double[] valores);
    double calcularMediaPonderada(double[] valores, double[] pesos);
    double calcularMediaHarmonica(double[] valores);
}
