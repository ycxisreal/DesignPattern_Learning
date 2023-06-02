package BehavioralPatterns.StrategyPattern;

import BehavioralPatterns.StrategyPattern.Classes.*;
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
            case 2->context = new Context(new SelectionSort());
            case 3->context = new Context(new InsertSort());
            default -> context = new Context(new SleepSort());
        }
        context.useStrategy(arr);
        System.out.println(Arrays.toString(arr));
        //使用简单工厂加策略模式
        arr = new int[]{5, 8, 9, 2, 4, 7, 6};
        context = new FactoryContext(in.nextInt());
        context.useStrategy(arr);
        System.out.println(Arrays.toString(arr));
        //使用简单工厂模式加策略模式加反射
        arr = new int[]{5, 8, 9, 2, 4, 7, 6};
        try {
            context = new FactoryContext(Class.forName(ISort.SelectionSort).asSubclass(ISort.class));
            context.useStrategy(arr);
            System.out.println("反射加接口常量："+Arrays.toString(arr));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
