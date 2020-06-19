package ru.geekbrains.lesson02;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
	String[][] array = new String[][]{
            {"4", "1", "2", "3"},
            {"4", "1", "2", "3"},
            {"4", "1", "2", "3"},
            {"4", "1", "2", "3"}
    };
        doTask(array);
    }

    static void doTask(String[][] array){
       int result = 0;
        for (String[] arrays : array) {
            result += arrays.length;
        }
        if (result < 16){
            throw new MyArraySizeExeption("Array size is not 4x4");
        }

        ArrayList
    }
}
