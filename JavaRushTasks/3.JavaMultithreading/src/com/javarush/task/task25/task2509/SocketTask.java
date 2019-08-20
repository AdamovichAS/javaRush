package com.javarush.task.task25.task2509;

import java.net.Socket;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public abstract class SocketTask<T> implements CancellableTask<T> {
    private Socket socket;

    protected synchronized void setSocket(Socket socket) {
        this.socket = socket;
    }

    public synchronized void cancel() {
        //close all resources here

            try {
                if (socket != null) {
                    socket.close();
                }
                //Thread.currentThread().interrupt();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    public RunnableFuture<T> newTask() {
        return new FutureTask<T>(this) {
            public boolean cancel(boolean mayInterruptIfRunning) {

                //close all resources here by using proper SocketTask method
                //call super-class method in finally block
                try {

                    socket.close();
                } catch (Exception ex) {

                } finally {
                    super.cancel(true);
                }
                return false;
            }
        };
    }
}