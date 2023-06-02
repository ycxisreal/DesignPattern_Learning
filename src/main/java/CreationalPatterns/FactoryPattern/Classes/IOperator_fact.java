package CreationalPatterns.FactoryPattern.Classes;

public interface IOperator_fact {
    double getResult(double a,double b);
    String ADD = "add";
    String SUB = "sub";
    String MUL = "mul";
    String DIV = "div";
    String SQRT = "Sqrt";
    String MUL_CLASS = "CreationalPatterns.FactoryPattern.Classes.Mul";
}
