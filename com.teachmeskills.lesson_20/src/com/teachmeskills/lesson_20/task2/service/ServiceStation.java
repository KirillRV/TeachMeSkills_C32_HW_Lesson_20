package com.teachmeskills.lesson_20.task2.service;

import java.util.LinkedList;
import java.util.Queue;

import static com.teachmeskills.lesson_20.task2.constants.Constants.MAX_CARS_AMOUNT;

public class ServiceStation {
    private final Queue<String> CarQueue = new LinkedList<>();

    public synchronized void addCar(String car) throws InterruptedException {
        while (isFull()) {
            wait();
        }
        CarQueue.add(car);
        notifyAll();
    }
    public synchronized void removeCar() throws InterruptedException {
        while (isEmpty()) {
            wait();
        }
        CarQueue.poll();
        notifyAll();
    }

    private boolean isFull() {
        return CarQueue.size() >= MAX_CARS_AMOUNT;
    }
    private boolean isEmpty() {
        return CarQueue.isEmpty();
    }
}

