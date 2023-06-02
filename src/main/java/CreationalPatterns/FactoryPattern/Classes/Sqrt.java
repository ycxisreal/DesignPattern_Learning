package CreationalPatterns.FactoryPattern.Classes;

public class Sqrt implements IOperator_fact {
    @Override
    public double getResult(double a, double b) {
        return a*a;
    }
}
