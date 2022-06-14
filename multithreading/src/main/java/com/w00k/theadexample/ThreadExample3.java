package com.w00k.theadexample;

public class ThreadExample3 {

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Myrunnable running");
            System.out.println("Myrunnable finished");
        }
    }

    /*
    This is one of the best options, implements a runnable
     */
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
