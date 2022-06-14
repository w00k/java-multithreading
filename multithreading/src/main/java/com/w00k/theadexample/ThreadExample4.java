package com.w00k.theadexample;

public class ThreadExample4 {

    /*
    This is with a anonymous class method
     */
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable running");
                System.out.println("Runnable finished");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
