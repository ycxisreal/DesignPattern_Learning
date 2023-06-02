package CreationalPatterns.FactoryPattern.Classes;

public class Sub implements IOperator_fact {
    @Override
    public double getResult(double a,double b) {
        return a-b;
    }
}
