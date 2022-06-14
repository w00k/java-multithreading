package com.w00k.theadexample;

import static java.lang.Thread.sleep;

public class ThreadExample9 {

    /*
    the jvm will be running, then all thread terminated
     */
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while(true) {
                sleep(1000);
                System.out.println("Running");
            }
        };

         Thread thread = new Thread(runnable);
         thread.setDaemon(true); // stop all daemon thread ...
         thread.start();
         sleep(3100);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
