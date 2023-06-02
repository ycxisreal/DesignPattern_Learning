package BehavioralPatterns.StrategyPattern.Classes;

public class SelctionSort implements ISort{
    @Override
    public void Sort(int[] arr) {
        for(int i=0;i< arr.length-1;i++){

            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
