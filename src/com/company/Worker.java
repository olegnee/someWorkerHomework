package com.company;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener someError;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener someError) {
        this.callback = callback;
        this.someError = someError;
    }
    public void start() {
        for (int i = 1; i <= 100; i++) {
            if (i == 33) {
                someError.onError("Housten we have a problem!");
                continue;
            }
            callback.onDone("Task " + i + " is done.");
        }
    }
}
