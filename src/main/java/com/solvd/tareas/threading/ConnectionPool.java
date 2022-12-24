package com.solvd.tareas.threading;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConnectionPool {
    private static final int MAX_CONNECTIONS = 5;
    private ConcurrentLinkedQueue<CustomConnection> connections;

    private static ConnectionPool pool;

    public ConnectionPool(){
        connections = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            connections.add(new CustomConnection());
        }
    }

    synchronized public static ConnectionPool newInstance() {
        if (pool == null) {
            pool = new ConnectionPool();
        }
        return pool;
    }
    public synchronized CustomConnection getConnection(){
        while (connections.isEmpty()) {
            try {
                System.out.println("No free connections ):");
                wait();
            } catch (InterruptedException e) {
                // ignore
            }
        }
        return connections.remove();
    }

    public synchronized void releaseConnection(CustomConnection con){
        connections.add(con);
        notifyAll();
    }
}
