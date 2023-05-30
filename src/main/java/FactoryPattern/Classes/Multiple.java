package FactoryPattern.Classes;

public class Multiple implements IOperator{
    @Override
    public double getResult(double a, double b) {
        return a*b;
    }
}
