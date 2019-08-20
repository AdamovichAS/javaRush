package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        State state = null;
        boolean work = true;
        while (work){
            if(state != thread.getState()){
                state = thread.getState();
                System.out.println(state);
                if(state == State.TERMINATED){
                    work = false;
                }
            }
        }
    }
}
