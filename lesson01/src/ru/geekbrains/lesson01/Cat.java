package ru.geekbrains.lesson01;

public class Cat implements Runable, Jumpable, Participant {
    private String name;
    private int height;
    private int distance;

    public Cat(String name, int height, int distance) {
        this.name = name;
        this.height = height;
        this.distance = distance;
    }

    @Override
    public void jump(Wall wall) {
        if (wall.attemptOfJump(height)) {
            System.out.println(String.format("%s jumped", name));
        } else {
            System.out.println(String.format("Jump fault..."));
        }
    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.attemptOfRun(distance)) {
            System.out.println(String.format("%s run", name));
        } else {
            System.out.println(String.format("Run fault..."));
        }
    }
}

