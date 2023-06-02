package CreationalPatterns.FactoryPattern.Classes;

public class Sqrt implements IOperator{
    @Override
    public double getResult(double a, double b) {
        return a*a;
    }
}
