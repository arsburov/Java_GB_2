package ru.geekbrains.lesson01;

public class Main {

    public static void main(String[] args) {
	Human human = new Human("John");
	Cat cat = new Cat("Django");
	Robot robot = new Robot("Fedor");
	human.run();
	human.jump();
	cat.run();
	cat.jump();
	robot.run();
	robot.jump();
    }
}
