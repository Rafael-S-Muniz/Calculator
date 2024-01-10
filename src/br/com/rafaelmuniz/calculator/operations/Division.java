package br.com.rafaelmuniz.calculator.operations;

public class Division extends Operation{
    public Division(){
        super("/");

    }

    @Override
    public int calculate(int x, int y) {
        return x / y;
    }
}
