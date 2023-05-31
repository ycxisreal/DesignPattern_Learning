package FactoryPattern.FactoryMethod;

import FactoryPattern.Classes.IOperator;
import FactoryPattern.Classes.Sqrt;

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
