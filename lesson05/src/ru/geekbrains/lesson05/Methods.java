package ru.geekbrains.lesson05;

public class Methods implements Runnable {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    public Methods(float[] arr) {
        this.arr = arr;
    }

    static void methodOne (){
        //float[] arr = new float[size];
        for (float a : arr) {
            a = 1.0f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    static void methodTwo(){
       // float[] arr = new float[size];
        for (float a : arr) {
            a = 1.0f;
        }
        long a = System.currentTimeMillis();
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        new Thread(new Methods(a1)).start();
        new Thread(new Methods(a2)).start();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println(System.currentTimeMillis() - a);
    }
    @Override
    public void run() {
        fillExp(arr);
    }

    static void fillExp(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
