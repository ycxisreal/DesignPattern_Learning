package CreationalPatterns.FactoryPattern.FactoryMethod;

import CreationalPatterns.FactoryPattern.Classes.IOperator_fact;

public interface IFactoryMethod {
    IOperator_fact getOperator(String o);
}
