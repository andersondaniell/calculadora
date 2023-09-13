package com.anderson.calculadora;

import java.util.Scanner;

public class TestCalculadora {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        String[] operacoes = { "\n1- Soma \n2- Subtração \n3- Multiplicação  \n4- Divisão" };
        for (String operacao : operacoes) {
            System.out.println(operacao);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual operação deseja realizar? ");
        int operacao = scanner.nextInt();

        while (operacao >= 5) {
            System.out.println("essa \"operação\" é invalida");
            break;
        }

        System.out.println("Digite o primeiro numero:");
        c.numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        c.numero2 = scanner.nextDouble();
        scanner.close();

        switch (operacao) {
            case 1:
                c.resultado();
                System.out.println(c.soma());
                break;
            case 2:
                c.resultado();
                System.out.println(c.subtracao());
                break;
            case 3:
                c.resultado();
                System.out.println(c.multiplicacao());
                break;
            case 4:
                if (c.numero2 == 0) {
                    System.out.println("Não é possivel dividir por zero!");
                } else {
                    c.resultado();
                    System.out.println(c.divisao());
                }
                break;
        }

    }
}
