package FactoryPattern;

import FactoryPattern.Classes.Add;
import FactoryPattern.Classes.IOperator;
import FactoryPattern.Factory.*;

import java.util.Scanner;

//示范启动类
public class FactoryStarter {
    public void Start(){
        //只需要提供想要的类型便可以通过工厂类自动生成想要的实现类
        IFactory factory = new Factory();
        System.out.println("输入想要进行的运算(sub,add,mul,div),以及两个运算数:");
        Scanner in = new Scanner(System.in);
        IOperator operator = factory.getOperator(in.next());
        System.out.println("结果："+ operator.getResult(in.nextDouble(), in.nextDouble()));
        //使用反射来构建工厂类
        IOperator o2 = factory.getOperator(Add.class);
        System.out.println("反射结果："+o2.getResult(in.nextDouble(),in.nextDouble()));
        //利用接口中的常量来生成实现类
        IOperator o3 = factory.getOperator(IOperator.DIV);
        System.out.println("结果："+o2.getResult(in.nextDouble(),in.nextDouble()));
    }
}
