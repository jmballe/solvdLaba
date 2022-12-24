package com.solvd.tareas.threading;

public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
        try {
            System.out.println("I'll be sleeping for 3 secs!");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time to wake up!");
    }
}
