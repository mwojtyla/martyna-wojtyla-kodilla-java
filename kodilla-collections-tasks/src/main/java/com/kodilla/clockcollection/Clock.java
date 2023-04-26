package com.kodilla.clockcollection;

import java.time.LocalTime;

public class Clock {
    int minute;
    LocalTime time;


    public Clock(int hours, int minutes) {
        this.time = LocalTime.of(hours, minutes);
    }

    public LocalTime getTime(){
        return time;
    }


    public LocalTime plusMinutes(int minute){
        return time.plusMinutes(minute);
    }
}
