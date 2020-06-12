package ru.geekbrains.lesson01;

public class Robot  implements Runable, Jumpable{
    private String name;

    Robot(String name){
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(String.format("%s jump", name));
    }

    @Override
    public void run() {
        System.out.println(String.format("%s run", name));
    }
}
