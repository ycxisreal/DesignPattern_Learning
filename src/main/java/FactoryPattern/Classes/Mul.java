package FactoryPattern.Classes;

public class Mul implements IOperator{
    @Override
    public double getResult(double a, double b) {
        return a*b;
    }
}
