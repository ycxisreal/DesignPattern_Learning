package BehavioralPatterns.StrategyPattern.Classes;

public class InsertSort implements ISort{
    @Override
    public void Sort(int[] arr) {
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{         //不需要交换
                    break;
                }
            }
        }
    }
}
