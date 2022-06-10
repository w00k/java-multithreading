package com.w00k.racecondition;

public class Counter {

    private long count = 0;

    /*
    this method create a race condition, because is not sync for the two threads
     */
    public void incAndGet() {
        this.count++;
    }

    public long getCount() {
        return this.count;
    }
}
