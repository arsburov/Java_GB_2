package ru.geekbrains.lesson02;

public class Application {

    public static void main(String[] args) {
	String[][] array = new String[][]{
            {4, 1, 2, 3},
            {1, 4, 5, 7},
            {5, 9, 1, 3},
            {10, 24, 566, 7}
    };
        doTask(array);
    }

    static void doTask(String[][] array){
       int result = 0;
        for (Object[] arrays : array) {
            result += arrays.length;
        }
        if (result < 16){
            throw new MyArraySizeExeption("Array size is not 4x4");
        }
    }
}
