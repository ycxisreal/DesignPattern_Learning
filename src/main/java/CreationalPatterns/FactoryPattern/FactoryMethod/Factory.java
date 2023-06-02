package CreationalPatterns.FactoryPattern.FactoryMethod;

import CreationalPatterns.FactoryPattern.Classes.IOperator_fact;

public class Factory implements IFactoryMethod{
    @Override
    public IOperator_fact getOperator(String o) {
        IFactoryMethod obj;
        switch (o) {
            case IOperator_fact.SUB, IOperator_fact.DIV, IOperator_fact.ADD, IOperator_fact.MUL -> obj = new FactoryBasic();
            case IOperator_fact.SQRT -> obj = new FactoryExtend();
            default -> {
                return null;
            }
        }
        return obj.getOperator(o);
    }
}
