package com.techreturners.exercise004;

public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        // Add your code here
        String[] input = str.split(" ");
        StringBuilder newSentence = new StringBuilder();

        for (String s:input) {
            String editString = s.substring(1);

            if (s.contains("!")) {
                editString = s.substring(1,s.length()-1);
                newSentence.append(editString).append(s.charAt(0)).append("ay").append(s.charAt(s.length()-1)).append(" ");
            }else {
                newSentence.append(editString).append(s.charAt(0)).append("ay").append(" ");
            }

        }
        return newSentence.toString().trim();
    }
}
