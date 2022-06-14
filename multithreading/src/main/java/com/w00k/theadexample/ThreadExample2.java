package com.w00k.theadexample;

public class ThreadExample2 {

    public static class MyTrhead extends Thread {
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }
    }

    /*
    Is not the best way, but for learning works
     */
    public static void main(String[] args) {
        MyTrhead myTrhead = new MyTrhead();
        myTrhead.start();
    }
}
