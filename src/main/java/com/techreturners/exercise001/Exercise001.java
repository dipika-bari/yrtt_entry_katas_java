package com.techreturners.exercise001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

    public int singles(int [] arr) {
        // Add your code here!

            List<Integer> numbers = new ArrayList<Integer>(arr.length);
            for (int i : arr)
            {
                numbers.add(i);
            }
            int count;
            List<Integer> singleDigits = new ArrayList<>();

            for (int num : numbers) {
                count = Collections.frequency(numbers, num);
                if (count == 1) {
                    singleDigits.add(num);
                }
            }
            return sumOfNumbers(singleDigits);
    }
        private static int sumOfNumbers (List < Integer > singleDigits) {
            int sum = 0;
            for (int digit : singleDigits) {
                sum = sum + digit;
            }
            return sum;
        }

}
