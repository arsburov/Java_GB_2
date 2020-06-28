package ru.geekbrains.lesson01;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean attemptOfJump(int n){
        if (n > height){
            return true;
        }
        else {
            return false;
        }
    }
}
