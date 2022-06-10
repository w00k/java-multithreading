package com.w00k.synchronize;

public class SynchronizeConditionExample {

    public static void main(String[] args) {

        CounterSync counter = new CounterSync();

        Thread thread1 = new Thread(getRunnable(counter, "Thread1 final count: "));
        Thread thread2 = new Thread(getRunnable(counter, "Thread2 final count: "));

        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(CounterSync counter, String message) {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incAndGet();
            }
            System.out.println(message + counter.getCount());
        };
    }
}
