package CreationalPatterns.FactoryPattern.SimpleFactory;

import CreationalPatterns.FactoryPattern.Classes.*;


import java.lang.reflect.InvocationTargetException;

public class SimpleFactory implements IFactory{
    @Override
    public IOperator_fact getOperator(String o) {
        if(o == null)
            return null;
        IOperator_fact operator = null;
        switch (o)
        {
            case "add"->operator = new Add();
            case "sub"->operator = new Sub();
            case "mul"->operator = new Mul();
            case "div"->operator = new Div();
        }
        return operator;
    }
    public IOperator_fact getOperator(Class<? extends IOperator_fact> clazz)
    {
        IOperator_fact obj;
        try {
            obj = clazz.getConstructor().newInstance();
            return obj;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
