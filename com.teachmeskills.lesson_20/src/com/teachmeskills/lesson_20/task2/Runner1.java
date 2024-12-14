package com.teachmeskills.lesson_20.task2;

import com.teachmeskills.lesson_20.task2.service.CarAdder;
import com.teachmeskills.lesson_20.task2.service.CarRemover;
import com.teachmeskills.lesson_20.task2.service.ServiceStation;

public class Runner1 {

    public static void run() {
        ServiceStation station = new ServiceStation();
        Thread addCarThread = new Thread(new CarAdder(station)); // Создание потока с CarAdder
        Thread removeCarThread = new Thread(new CarRemover(station)); // Создание потока с CarRemover

        addCarThread.start();
        removeCarThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        addCarThread.interrupt();
        removeCarThread.interrupt();
        System.out.println("Yay! It's working:D");
    }
}