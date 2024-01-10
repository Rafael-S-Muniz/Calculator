package br.com.rafaelmuniz.calculator.operations;

public class Subtraction extends Operation {
    public Subtraction() {
        super("-");
    }

    public int calculate(int x, int y) {
        return x - y;
    }
}
