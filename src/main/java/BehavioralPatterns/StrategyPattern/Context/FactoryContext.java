package BehavioralPatterns.StrategyPattern.Context;

import BehavioralPatterns.StrategyPattern.Classes.*;

import java.lang.reflect.InvocationTargetException;

public class FactoryContext implements IContext{
    ISort sort;

    public FactoryContext(int i) {
        switch (i)
        {
            case 1->sort = new BubbleSort();
            case 2->sort = new SelectionSort();
            case 3->sort = new InsertSort();
            default -> sort = new SleepSort();
        }
    }

    public FactoryContext(Class<? extends ISort> clazz) {
        try {
            sort = clazz.getConstructor().newInstance();
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void useStrategy(int[] arr) {
        sort.Sort(arr);
    }
}
