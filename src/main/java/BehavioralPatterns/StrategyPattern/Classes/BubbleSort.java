package BehavioralPatterns.StrategyPattern.Classes;

public class BubbleSort implements ISort{
    public void Sort(int [] arr){
        int temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=arr.length-1; j>i; j--){

                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
