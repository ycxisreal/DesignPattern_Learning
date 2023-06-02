package CreationalPatterns.FactoryPattern.SimpleFactory;

import CreationalPatterns.FactoryPattern.Classes.IOperator_fact;

public interface IFactory {
    IOperator_fact getOperator(String o);
    //使用反射来进一步解耦
    IOperator_fact getOperator(Class<? extends IOperator_fact> clazz);
}
