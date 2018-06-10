package main;

public class Bird extends Villager{
	
	public Bird(String name, int age, House house, int money) {
		super(name, age, house, money);
	}

	public void move() {
		System.out.println("I am flying");
	}

	public void talk() {
	System.out.println("tweet tweet");
	}
	

}
