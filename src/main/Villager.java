package main;

public abstract class Villager {
	
	public Villager(){
		String name;
		int age;
		House house;
		int money;
	}
	
	public abstract void move();
	public abstract void talk();
}