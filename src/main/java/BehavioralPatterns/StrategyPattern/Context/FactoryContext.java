package BehavioralPatterns.StrategyPattern.Context;

import BehavioralPatterns.StrategyPattern.Classes.*;

public class FactoryContext implements IContext{
    ISort sort;

    public FactoryContext(int i) {
        switch (i)
        {
            case 1->sort = new BubbleSort();
            case 2->sort = new SelctionSort();
            case 3->sort = new InsertSort();
            default -> sort = new SleepSort();
        }
    }

    @Override
    public void useStrategy(int[] arr) {
        sort.Sort(arr);
    }
}
