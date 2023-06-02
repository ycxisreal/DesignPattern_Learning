package BehavioralPatterns.StrategyPattern.Classes;

import java.util.concurrent.CountDownLatch;

public class SleepSort implements ISort{
    private int[] temp = null;
    private int index;
    private CountDownLatch latch = null;
    public SleepSort() {
        index = 0;
    }

    class MyThread extends Thread
    {
        int sleepTime;
        public MyThread(int S)
        {
            sleepTime = S;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(sleepTime* 10L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            temp[index++] = sleepTime;
            latch.countDown();
        }
    }
    //睡眠排序法
    @Override
    public void Sort(int[] arr) {
        latch = new CountDownLatch(arr.length);
        temp = new int[arr.length];
        index = 0;
        for (int j : arr)
            new MyThread(j).start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}
