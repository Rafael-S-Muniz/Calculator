package br.com.rafaelmuniz.calculator.operations;

public class Multiplication extends Operation {
    public Multiplication(){
        super ("*");
    }

    @Override
    public int calculate(int x, int y) {
        return x * y;
    }
}
