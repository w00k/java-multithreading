package com.w00k.theadexample;

public class ThreadExample6 {
    /*
    Get a name of the "thread", is not warranty of the order of the running
     */
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " running");
        };

        Thread thread1 = new Thread(runnable, "The Thread 1 ");
        thread1.start();

        Thread thread2 = new Thread(runnable, "The Thread 2 ");
        thread2.start();
    }
}
