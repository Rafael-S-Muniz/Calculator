package br.com.rafaelmuniz.calculator;

import br.com.rafaelmuniz.calculator.operations.*;

import java.util.List;
import java.util.Scanner;

public class Calculator {

    public final static List<Operation> operations = List.of(
            new Sum(),
            new Subtraction(),
            new Multiplication(),
            new Division()
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Operation operationToDo = null;
        while (operationToDo == null) {
            System.out.println("Qual operação deseja fazer?");
            String userOperation = scanner.next();
            for (Operation operation : operations) {
                if (userOperation.equals(operation.operator)) {
                    operationToDo = operation;
                    break;
                }
            }
            if (operationToDo == null) {
                System.out.println("Operacao inválida, tente again");
            }
        }
        System.out.println("Digite o primeiro número");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = scanner.nextInt();
        int result = operationToDo.calculate(n1, n2);
        System.out.println("O resultado é: " + result);

    }
}
