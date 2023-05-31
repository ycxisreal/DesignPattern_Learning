package FactoryPattern.Classes;

public interface IOperator {
    public double getResult(double a,double b);
    public String ADD = "add";
    public String SUB = "sub";
    public String MUL = "mul";
    public String DIV = "div";
}
