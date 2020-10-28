package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise003 {

    // Scenario
    // Several people are standing in a row divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1, 
    // and so on.

    // Task
    // Given an array of positive integers (the weights of the people), return a new array/tuple of two integers, where the first one is the total weight of 
    // team 1, and the second one is the total weight of team 2.

    // Notes
    // Array size is at least 1.
    // All numbers will be positive.
    // Input >> Output Examples
    // rowWeights([13, 27, 49])  ==>  return (62, 27)
    // Explanation:
    // The first element 62 is the total weight of team 1, and the second element 27 is the total weight of team 2.

    // rowWeights([50, 60, 70, 80])  ==>  return (120, 140)
    // Explanation:
    // The first element 120 is the total weight of team 1, and the second element 140 is the total weight of team 2.

    // rowWeights([80])  ==>  return (80, 0)
    // Explanation:
    // The first element 80 is the total weight of team 1, and the second element 0 is the total weight of team 2.

    public static int[] rowWeights(final int[] weights) {
        // Your code here!
        int[] sum = sortIntoTeams(weights);
        return sum;
    }
        private static int[] sortIntoTeams(int[] weights) {
            List<Integer> team1 = new ArrayList<>();
            List<Integer> team2 = new ArrayList<>();

            for (int i = 0; i < weights.length ; i++) {
                if(i%2==0){
                    team1.add(weights[i]);
                }else {
                    team2.add(weights[i]);
                }
            }
            return calculateSumOfWeights(team1, team2);
        }

        private static int[] calculateSumOfWeights(List<Integer> team1, List<Integer> team2) {
            int[] sumOfWeights = new int[2];
            int sumOfTeam1 = 0;
            int sumOfTeam2 = 0;
            for (int n: team1) {
                sumOfTeam1 = sumOfTeam1 + n;
            }
            for (int n: team2) {
                sumOfTeam2 = sumOfTeam2 + n;
            }
            sumOfWeights[0]=sumOfTeam1;
            sumOfWeights[1]=sumOfTeam2;

            return sumOfWeights;
        }
    }

