package com.techreturners.exercise005;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise005 {

    // Introduction
    // The wave (known as the Mexican wave in the English-speaking world outside North America) is an example of metachronal rhythm achieved 
    // in a packed stadium when successive groups of spectators briefly stand, yell, and raise their arms. Immediately upon stretching to full height, 
    // the spectator returns to the usual seated position.
    // The result is a wave of standing spectators that travels through the crowd, even though individual spectators never move away from their seats. 
    // In many large arenas the crowd is seated in a contiguous circuit all the way around the sport field, and so the wave is able to travel continuously 
    // around the arena; in discontiguous seating arrangements, the wave can instead reflect back and forth through the crowd. When the gap in seating is 
    // narrow, the wave can sometimes pass through it. Usually only one wave crest will be present at any given time in an arena, although simultaneous, 
    // counter-rotating waves have been produced. (Source Wikipedia)
    
    // Task
    // In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return 
    // that string in an array where an uppercase letter is a person standing up. 
    
    // Rules
    // 1.  The input string will always be lower case but maybe empty.
    // 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
    
    // Example
    // wave("hello") => ["Hello", "hEllo", "heLlo", "helLo", "hellO"]

    // Good luck and enjoy!

    public String[] mexicanWave(String str) {
        // Your code here!
            int arraySize = str.length();
            String[] wave = new String[arraySize];
            for (int i = 0; i < arraySize; i++) {
                char upperCaseLetter;
                char currentCharacter = str.charAt(i);
                upperCaseLetter = Character.toUpperCase(currentCharacter);
                StringBuilder inputString = new StringBuilder(str);
                inputString.setCharAt(i, upperCaseLetter);

                if(Character.isSpaceChar(currentCharacter)){
                    wave[i] = " ";
                }else {
                    wave[i] = inputString.toString();
                }
            }
            Object[] validValues = Arrays.stream(wave).filter(value -> value != null && value.trim().length() > 0).toArray();
            System.out.println(Arrays.toString(validValues));
            String[] mexicanWave = new String[validValues.length];
            System.arraycopy(validValues,0,mexicanWave,0,validValues.length);
            return mexicanWave;
        }

}