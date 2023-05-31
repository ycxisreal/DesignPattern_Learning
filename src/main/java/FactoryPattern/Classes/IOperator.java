package FactoryPattern.Classes;

public interface IOperator {
    double getResult(double a,double b);
    String ADD = "add";
    String SUB = "sub";
    String MUL = "mul";
    String DIV = "div";
    String SQRT = "Sqrt";
}
