package CreationalPatterns.FactoryPattern.SimpleFactory;

import CreationalPatterns.FactoryPattern.Classes.IOperator;

public interface IFactory {
    IOperator getOperator(String o);
    //使用反射来进一步解耦
    IOperator getOperator(Class<? extends IOperator> clazz);
}
