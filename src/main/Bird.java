package main;

public class Bird extends Villager{
	
	public Bird(String name, int age, int money) {
		super(name, age, money);
	}

	public void move() {
		System.out.println("I am flying");
	}

	public void talk() {
	System.out.println("tweet tweet");
	}
	

}
