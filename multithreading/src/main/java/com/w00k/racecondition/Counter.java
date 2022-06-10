package com.w00k.racecondition;

public class Counter {

    private long count = 0;

    public void incAndGet() {
        this.count++;
    }

    public long getCount() {
        return this.count;
    }
}
