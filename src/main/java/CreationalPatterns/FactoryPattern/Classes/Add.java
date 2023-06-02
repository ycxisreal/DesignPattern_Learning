package CreationalPatterns.FactoryPattern.Classes;

public class Add implements IOperator_fact {
    @Override
    public double getResult(double a, double b) {
        return a+b;
    }
}
