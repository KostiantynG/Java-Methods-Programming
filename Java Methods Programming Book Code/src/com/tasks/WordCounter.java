package com.tasks;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String string = "Hello Word my name is Z hello all";
        String[] split = string.toLowerCase().split(" ");
        Map<String, Integer> words = new HashMap<>();
        Integer value = 1;
        for (String s : split) {
            if (words.get(s) == null) {
                words.put(s, value);
            } else {
                words.replace(s, value + 1);
            }
        }
        System.out.println(words);
    }
}