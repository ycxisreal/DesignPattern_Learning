package CreationalPatterns.FactoryPattern.FactoryMethod;

import CreationalPatterns.FactoryPattern.Classes.IOperator;

public interface IFactoryMethod {
    IOperator getOperator(String o);
}
