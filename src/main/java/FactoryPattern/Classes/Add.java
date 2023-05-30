package FactoryPattern.Classes;

public class Add implements IOperator{
    @Override
    public double getResult(double a, double b) {
        return a+b;
    }
}
