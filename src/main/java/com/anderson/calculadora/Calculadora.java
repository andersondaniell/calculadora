package com.anderson.calculadora;

public class Calculadora {

    double numero1;
    double numero2;

    double soma() {
        return numero1 + numero2;
    }

    double subtracao() {
        return numero1 - numero2;
    }

    double multiplicacao() {
        return numero1 * numero2;
    }

    double divisao() {
        return numero1 / numero2;
    }

    void resultado() {
        System.out.println("O resultado é: ");
    }
}
