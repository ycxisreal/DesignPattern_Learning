package BehavioralPatterns.StrategyPattern.Classes;

public interface ISort {
    String BubbleSort = "BehavioralPatterns.StrategyPattern.Classes.BubbleSort";
    String InsertSort = "BehavioralPatterns.StrategyPattern.Classes.InsertSort";
    String SelectionSort = "BehavioralPatterns.StrategyPattern.Classes.SelectionSort";
    String SleepSort = "BehavioralPatterns.StrategyPattern.Classes.SleepSort";
    void Sort(int [] arr);
}
