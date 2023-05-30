package FactoryPattern.Factory;

import FactoryPattern.Classes.*;

public class Factory implements IFactory{
    @Override
    public IOperator getOperator(String o) {
        if(o == null)
            return null;
        IOperator operator = null;
        switch (o)
        {
            case "add"->operator = new Add();
            case "sub"->operator = new Sub();
            case "mul"->operator = new Multiple();
            case "div"->operator = new Div();
        }
        return operator;
    }
}
