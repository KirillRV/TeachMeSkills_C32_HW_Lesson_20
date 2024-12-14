package com.teachmeskills.lesson_20;

import com.teachmeskills.lesson_20.task1.Runner;
import com.teachmeskills.lesson_20.task2.Runner1;
/**
 * Задача 1
 * 1. Cоздать программу, иммитирующую утро: чтение нововостей, завтра, кофе.
 * Каждому потоку задать имя и приоритет из конфиг файла.
 * Пусть будет 3 потока.
 * Создать и запустить 3 потока.
 * Сделать два варианта: используя интерфейс Runnable и/или используя класс Thread.
 * <p>
 * Задача 2
 * 2. Есть СТО. На сто может быть в обслуживании максимум определенное количество машин.
 * Создать класс, который будет запускаться в отдельном потоке и будет добавлять машины на обсуживание в СТО.
 * Создать класс, который будет запускаться в отдельном потоке и будет забирать исправленные машины из СТО.
 * Пусть максимальное количество доступных для обсуживания машин задается в интерфейсе для хранения констант.
 * Использовать synchronized, wait, notify.
 */
public class AppRunner extends Exception{
    public static void main(String[] args) {
        Runner.run();
        Runner1.run();
            }
        }