package com.solvd.tareas.threading;

public class Main {
    public static void main(String[] args) {
        //Testing runnable and threads.
        ThreadThread  t1 = new ThreadThread();
        t1.start();
        ThreadRunnable test2 = new ThreadRunnable();
        Thread t2 = new Thread(test2,"test2");
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ignored) {}

        //Testing connection pool.
        ConnectionPool conPool = ConnectionPool.newInstance();
        System.out.println("\n----Testing pool connection threads---- \n");
        poolThread pt1 = new poolThread();
        poolThread pt2 = new poolThread();
        poolThread pt3 = new poolThread();
        poolThread pt4 = new poolThread();
        poolThread pt5 = new poolThread();
        poolThread pt6 = new poolThread();
        poolThread pt7 = new poolThread();

        pt1.start();
        pt2.start();
        pt3.start();
        pt4.start();
        pt5.start();
        pt6.start();
        pt7.start();

        try {
            pt1.join();
            pt2.join();
            pt3.join();
            pt4.join();
            pt5.join();
            pt6.join();
            pt7.join();
        } catch (InterruptedException ignored) {}

        conPool.getConnection();
    }
}
