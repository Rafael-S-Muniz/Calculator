package br.com.rafaelmuniz.calculator.operations;

public abstract class Operation {

    public final String operator;

    public Operation(String operator) {
        this.operator = operator;
    }

    public abstract int calculate(int x, int y);

}


