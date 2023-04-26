package com.kodilla.clockcollection;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main (String[] args) {
        Clock clock1 = new Clock(20,59);
        Clock clock2 = new Clock(23,59);
        Clock clock3 = new Clock(12,50);
        Clock clock4 = new Clock(17,33);
        Clock clock5 = new Clock(10,19);

        List<Clock> clockList = new LinkedList<>();
        clockList.add(clock1);
        clockList.add(clock2);
        clockList.add(clock3);
        clockList.add(clock4);
        clockList.add(clock5);

        System.out.println("Time before change:");
        for (Clock clock: clockList){
            System.out.println(clock.getTime().getHour()+":"+clock.getTime().getMinute());
        }

        System.out.println("\n");

        System.out.println("Time after change:");
        for (Clock clock: clockList){
            LocalTime timeChanged = clock.plusMinutes(1);
            System.out.println(timeChanged);
        }
    }
}
