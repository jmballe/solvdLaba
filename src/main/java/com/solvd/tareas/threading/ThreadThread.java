package com.solvd.tareas.threading;

public class ThreadThread extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
        try {
            System.out.println("I'll be sleeping for 6 secs!");
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time to wake up!");
    }
}
