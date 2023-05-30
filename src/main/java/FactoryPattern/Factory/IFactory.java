package FactoryPattern.Factory;

import FactoryPattern.Classes.IOperator;

public interface IFactory {
    public IOperator getOperator(String o);
}
