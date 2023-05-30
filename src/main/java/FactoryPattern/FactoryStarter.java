package FactoryPattern;

import FactoryPattern.Classes.IOperator;
import FactoryPattern.Factory.*;

import java.util.Scanner;

//示范启动类
public class FactoryStarter {
    public void Start(){
        IFactory factory = new Factory();
        System.out.println("输入想要进行的运算(sub,add,mul,div),以及两个运算数:");
        Scanner in = new Scanner(System.in);
        IOperator operator = factory.getOperator(in.next());
        System.out.println("结果："+operator.getResult(in.nextDouble(), in.nextDouble()));
    }
}
