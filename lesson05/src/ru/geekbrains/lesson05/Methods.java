package ru.geekbrains.lesson05;

public class Methods {
    static final int size = 10000000;
    static final int h = size / 2;


    static void methodOne (){
        float[] arr = new float[size];
        for (float a : arr) {
            a = 1.0f;
            System.out.println(a);
        }
    }
}
