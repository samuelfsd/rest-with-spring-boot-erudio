package br.com.erudio.math;

public class SimpleMath {

    public double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public double subtraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public double multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public double division(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    public double mean(double numberOne, double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public double sqrt(double number) {
        return Math.sqrt(number);
    }
}
