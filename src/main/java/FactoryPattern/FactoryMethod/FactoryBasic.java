package FactoryPattern.FactoryMethod;

import FactoryPattern.Classes.*;

public class FactoryBasic extends Factory{
    @Override
    public IOperator getOperator(String o) {
        IOperator operator = null;
        switch (o)
        {
            case "add"->operator = new Add();
            case "sub"->operator = new Sub();
            case "mul"->operator = new Mul();
            case "div"->operator = new Div();
        }
        return operator;
    }
}
