package BehavioralPatterns.StrategyPattern;

import BehavioralPatterns.StrategyPattern.Classes.BubbleSort;
import BehavioralPatterns.StrategyPattern.Classes.InsertSort;
import BehavioralPatterns.StrategyPattern.Classes.SelctionSort;
import BehavioralPatterns.StrategyPattern.Classes.SleepSort;
import BehavioralPatterns.StrategyPattern.Context.*;

import java.util.Arrays;
import java.util.Scanner;

public class StrategyStarter {
    public void Start()
    {
        int[] arr = {5,8,9,2,4,7,6};
        IContext context;
        Scanner in = new Scanner(System.in);
        //单独使用策略模式
        int index;
        index = in.nextInt();
        switch (index)
        {
            case 1->context = new Context(new BubbleSort());
            case 2->context = new Context(new SelctionSort());
            case 3->context = new Context(new InsertSort());
            default -> context = new Context(new SleepSort());
        }
        context.useStrategy(arr);
        System.out.println(Arrays.toString(arr));
        //使用简单工厂加策略模式
        context = new FactoryContext(in.nextInt());
        context.useStrategy(arr);
        System.out.println(Arrays.toString(arr));
    }
}
