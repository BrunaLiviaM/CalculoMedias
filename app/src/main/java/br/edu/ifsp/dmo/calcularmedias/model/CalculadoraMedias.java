package br.edu.ifsp.dmo.calcularmedias.model;

public class CalculadoraMedias implements ConversorMedias {

    @Override
    public double calcularMediaAritmetica(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    @Override
    public double calcularMediaPonderada(double[] valores, double[] pesos) {
        double somaProdutos = 0;
        double somaPesos = 0;

        for (int i = 0; i < valores.length; i++) {
            somaProdutos += valores[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return somaProdutos / somaPesos;
    }

    @Override
    public double calcularMediaHarmonica(double[] valores) {
        double somaReciprocos = 0;

        for (double valor : valores) {
            somaReciprocos += 1 / valor;
        }

        return valores.length / somaReciprocos;
    }
}

