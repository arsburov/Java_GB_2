package ru.geekbrains.lesson03;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    doTask01();
    }
    static void doTask01(){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("cat", "dog", "cow", "cat", "elephant", "horse", "horse", "apple",
                "orange", "beer", "water", "python", "java", "java", "book", "home", "office", "job", "job", "Prague", "cat"));
        HashSet<String> uniqueWords = new HashSet<>(words);
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String string : words){
            if(wordsMap.keySet().contains(string)){
                wordsMap.put(string, wordsMap.get(string)+1);
            } else {
                wordsMap.put(string, 1);
            }
        }
        System.out.println(uniqueWords.toString());
        System.out.println(wordsMap);
    }
}
