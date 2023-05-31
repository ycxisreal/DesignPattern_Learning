package FactoryPattern.Factory;

import FactoryPattern.Classes.IOperator;

public interface IFactory {
    public IOperator getOperator(String o);
    //使用反射来进一步解耦
    public IOperator getOperator(Class<? extends IOperator> clazz);
}
