package ru.geekbrains.lesson05;

public class Methods {
    static final int size = 10000000;
    static final int h = size / 2;

    static void methodOne (){
        float[] arr = new float[size];
        for (float a : arr) {
            a = 1.0f;
            //System.out.println(a);
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }
}
