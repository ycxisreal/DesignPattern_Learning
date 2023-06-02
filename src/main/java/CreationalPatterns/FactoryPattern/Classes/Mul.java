package CreationalPatterns.FactoryPattern.Classes;

public class Mul implements IOperator_fact {
    @Override
    public double getResult(double a, double b) {
        return a*b;
    }
}
