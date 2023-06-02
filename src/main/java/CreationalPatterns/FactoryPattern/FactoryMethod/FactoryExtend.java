package CreationalPatterns.FactoryPattern.FactoryMethod;

import CreationalPatterns.FactoryPattern.Classes.IOperator_fact;
import CreationalPatterns.FactoryPattern.Classes.Sqrt;

public class FactoryExtend extends Factory {
    @Override
    public IOperator_fact getOperator(String o) {
        IOperator_fact operator = null;
        switch (o)
        {
            case IOperator_fact.SQRT -> operator = new Sqrt();
            //未来进行拓展
        }
        return operator;
    }
}
