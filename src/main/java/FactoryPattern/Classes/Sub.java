package FactoryPattern.Classes;

public class Sub implements IOperator {
    @Override
    public double getResult(double a,double b) {
        return a-b;
    }
}
