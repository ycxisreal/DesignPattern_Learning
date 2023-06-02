package CreationalPatterns.FactoryPattern.FactoryMethod;

import CreationalPatterns.FactoryPattern.Classes.*;


public class FactoryBasic extends Factory{
    @Override
    public IOperator_fact getOperator(String o) {
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
}
