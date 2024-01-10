package br.com.rafaelmuniz.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = "";
        while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
            System.out.println("Qual operacao deseja fazer: +, -, *, /");
            operation = scanner.next();
        }
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        int result = 0;
        switch (operation) {
            case "+" -> result = sum(n1, n2);
            case "-" -> result = subtraction(n1, n2);
            case "*" -> result = multiplication(n1, n2);
            case "/" -> {
                if (n2 == 0) {
                    System.out.println("Não pode fazer divisão por 0");
                    return;
                }
                result = division(n1, n2);
            }
        }
        System.out.println("O resultado da operacao é: ");
        System.out.println(result);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }
}


// Tipo nomeDaVariavel = "valor da variavel"
// classe variavel = valor


// visibilade [static] TypoRetorno nomeDaFuncao(){}