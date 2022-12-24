package com.solvd.tareas.threading;

public class poolThread extends Thread{
    public void run(){
        System.out.println("Hello from a pool thread!");
        CustomConnection con = ConnectionPool.newInstance().getConnection();
        if (con != null){
            System.out.println("I'll be occupying a connection for " + 5 + " secs!");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Releasing connection");
            ConnectionPool.newInstance().releaseConnection(con);
        }
    }
}
