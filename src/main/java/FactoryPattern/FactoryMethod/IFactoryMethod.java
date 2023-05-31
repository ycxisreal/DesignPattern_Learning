package FactoryPattern.FactoryMethod;

import FactoryPattern.Classes.IOperator;

public interface IFactoryMethod {
    IOperator getOperator(String o);
}
