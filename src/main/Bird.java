package main;

public class Bird extends Villager{
	
	public Bird(String name, int age, int money) {
		super(name, age, money);
	}

	public void move() {
		Village.ui.print("I am flying");
	}

	public void talk() {
	Village.ui.print("tweet tweet");
	}
	

}
