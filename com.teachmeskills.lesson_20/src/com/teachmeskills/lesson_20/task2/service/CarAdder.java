package com.teachmeskills.lesson_20.task2.service;

public class CarAdder implements Runnable {
    private final ServiceStation serviceStation;
    private int carCount = 1;

    public CarAdder(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String car = "Car-" + carCount++; // Генерация имени автомобиля
                serviceStation.addCar(car);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}