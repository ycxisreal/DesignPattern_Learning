package FactoryPattern.Classes;

public class Div implements IOperator{
    @Override
    public double getResult(double a, double b) {
        double result = 0;
        try {
            result = a/b;
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
