package com.techreturners.exercise002;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

    public int past(int h, int m, int s) {
        // Your code here!
        int hoursToMs = h*60*60*1000;
        int minutesToMs = m * 60 * 1000;
        int secondsToMs = s * 1000;
        System.out.println(h+":"+m+":"+s);
        int timeInMilliseconds = hoursToMs+minutesToMs+secondsToMs;
        System.out.println("Time in milliseconds:"+timeInMilliseconds);
        return (timeInMilliseconds);
    }
}