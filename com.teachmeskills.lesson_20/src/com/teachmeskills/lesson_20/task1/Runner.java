package com.teachmeskills.lesson_20.task1;
import com.teachmeskills.lesson_20.task1.morning.CoffeeThread;
import com.teachmeskills.lesson_20.task1.morning.BreakfastThread;
import com.teachmeskills.lesson_20.task1.morning.NewsThread;

public class Runner {
    public static void run(){
     Thread drinkcoffeeThread = new CoffeeThread();
     Thread eatbreakfastThread = new BreakfastThread();
     Thread readnewsThread = new NewsThread();

     drinkcoffeeThread.setName("Coffee Break");
     eatbreakfastThread.setName("Breakfast time");
     readnewsThread.setName("Read News");

     drinkcoffeeThread.setPriority(Thread.MIN_PRIORITY);
     eatbreakfastThread.setPriority(Thread.NORM_PRIORITY);
     readnewsThread.setPriority(Thread.MAX_PRIORITY);

     drinkcoffeeThread.start();
     eatbreakfastThread.start();
     readnewsThread.start();

    }
}

