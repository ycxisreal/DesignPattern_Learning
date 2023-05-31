package FactoryPattern.FactoryMethod;

import FactoryPattern.Classes.IOperator;

public class Factory implements IFactoryMethod{
    @Override
    public IOperator getOperator(String o) {
        IFactoryMethod obj;
        switch (o) {
            case IOperator.SUB, IOperator.DIV, IOperator.ADD, IOperator.MUL -> obj = new FactoryBasic();
            case IOperator.SQRT -> obj = new FactoryExtend();
            default -> {
                return null;
            }
        }
        return obj.getOperator(o);
    }
}
