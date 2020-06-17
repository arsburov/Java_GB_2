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

	Participant[] participants = new Participant[5];
	participants[0] = new Human("John", 3, 5);
	participants[1] = new Human("Jorik", 2, 4);
	participants[2] = new Cat("Django", 2, 6);
	participants[3] = new Cat("Maison", 1, 5);
	participants[4] = new Robot("Fedor", 6, 12);

	Obstacle[] obstacles = new Obstacle[10];
	obstacles[0] = new Treadmill(5);
	obstacles[1] = new Treadmill(2);
	obstacles[2] = new Treadmill(4);
	obstacles[3] = new Treadmill(6);
	obstacles[4] = new Treadmill(10);
	obstacles[5] = new Wall(1);
	obstacles[6] = new Wall(2);
	obstacles[7] = new Wall(3);
	obstacles[8] = new Wall(4);
	obstacles[9] = new Wall(5);

	for (int i = 0; i < participants.length ; i++) {
		for (int j = 0; j < obstacles.length; j++) {
			participants[i].run((Treadmill) obstacles[j]);
		}
		}
    }
}
