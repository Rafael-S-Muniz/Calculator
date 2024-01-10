package br.com.rafaelmuniz.calculator.operations;

public class Sum extends Operation {

    public Sum() {
        super("+");
    }

    public int calculate(int x, int y) {
        return x + y;
    }
}
