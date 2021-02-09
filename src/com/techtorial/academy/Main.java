package com.techtorial.academy;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] words = {"a", "b", "a", "c", "b"};
        Map<String, Integer> map = wordCount(words);


        int[] arr = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(arr, 2));
    }

    /*
     * https://codingbat.com/prob/p117630
     */
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                int currentCount = map.get(s);
                map.put(s, ++currentCount);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }


    /*
     * https://codingbat.com/prob/p134300
     */
    public static boolean sameEnds(int[] nums, int len) {
        int[] start = new int[len];
        int[] end = new int[len];

        // Fill out the start array
        for (int i = 0; i < len; i++) {
            start[i] = nums[i];
        }

        // Fill out the end array
        int index = 0;
        for (int i = nums.length - len; i < nums.length; i++) {
            end[index++] = nums[i];
        }

        // Iteratively compare the arrays
        for (int i = 0; i < start.length; i++) {
            // If at least one pair of numbers doesn't match, return false
            if (start[i] != end[i]) {
                return false;
            }
        }

        // If we reached this point, it means the arrays are the same
        return true;
    }

}
