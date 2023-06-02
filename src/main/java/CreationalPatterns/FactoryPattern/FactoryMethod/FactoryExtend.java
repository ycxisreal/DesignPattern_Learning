package CreationalPatterns.FactoryPattern.FactoryMethod;

import CreationalPatterns.FactoryPattern.Classes.IOperator;
import CreationalPatterns.FactoryPattern.Classes.Sqrt;

public class FactoryExtend extends Factory {
    @Override
    public IOperator getOperator(String o) {
        IOperator operator = null;
        switch (o)
        {
            case IOperator.SQRT -> operator = new Sqrt();
            //未来进行拓展
        }
        return operator;
    }
}
