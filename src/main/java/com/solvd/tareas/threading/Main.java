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
        PoolThread pt1 = new PoolThread();
        PoolThread pt2 = new PoolThread();
        PoolThread pt3 = new PoolThread();
        PoolThread pt4 = new PoolThread();
        PoolThread pt5 = new PoolThread();
        PoolThread pt6 = new PoolThread();
        PoolThread pt7 = new PoolThread();

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
