package com.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String string = "Hello Hello Hello Word Word Word Word";
        String[] split = string.toLowerCase().split("\\s+");
        System.out.println(Arrays.toString(split));
        Map<String, Integer> words = new HashMap<>();
        Integer count;
        for (String s : split) {
            count = words.containsKey(s) ? words.get(s) : 0;
            words.put(s, count + 1);
        }
        System.out.println(words);
    }
}