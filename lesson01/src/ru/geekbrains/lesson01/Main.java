package ru.geekbrains.lesson01;

public class Main {

    public static void main(String[] args) {
	Human human = new Human("John", 2, 4);
	Cat cat = new Cat("Django", 1, 3);
	Robot robot = new Robot("Fedor",2 ,5);
	Treadmill treadmill = new Treadmill(5);
	Wall wall = new Wall(1);
	human.run(treadmill);
	human.jump(wall);

    }
}
