package ru.geekbrains.lesson01;

public class Treadmill implements Obstacle{
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public boolean attemptOfRun(int n){
        if (n > distance){
            return true;
        }
        else {
            return false;
        }
    }
}
