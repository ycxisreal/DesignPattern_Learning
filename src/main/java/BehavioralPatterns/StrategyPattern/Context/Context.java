package BehavioralPatterns.StrategyPattern.Context;

import BehavioralPatterns.StrategyPattern.Classes.ISort;

public class Context implements IContext{
    ISort sort;
    public Context(ISort a)
    {
        sort = a;
    }
    public void useStrategy(int[] arr)
    {
        sort.Sort(arr);
    }

}
