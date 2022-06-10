package com.w00k.racecondition.synchronize;

public class CounterSync {

    private long count = 0;

    /*
    This condition is sync and control the access into count for the both of threads
     */
    public void incAndGet() {
        synchronized (this) {
            this.count++;
        }
    }

    public long getCount() {
        return this.count;
    }
}
