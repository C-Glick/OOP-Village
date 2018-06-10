package main;

public abstract class Villager{
	
	String name;
	int age;
	House house;
	int money;

	public Villager(String name, int age, int money) {
		super();
		this.name = name;
		this.age = age;
		this.house = new House ("Bus Station", 0, this, 0); 	//default house
		this.money = money;
	}
	
	public abstract void move();
	public abstract void talk();
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	public void eat(){
		System.out.println("Eating...");
	}
	
	public void buildHouse(String street, int size, int cost) {
		if(this.money>=cost) {
			this.house= new House(street, size, this, cost);
			System.out.println(this.name+" built a house on "+street+" Street for $"+cost+", it is "+size+" square ft.");	
			this.money=this.money-this.house.cost;
		}else {
			System.out.println(this.name+" does not have enough money to build this house.");
			this.reportMoney();
			System.out.println("House cost: $"+cost);
		}
	
	}
	
	public void reportMoney() {
		System.out.println(this.name+" has $"+this.money);
	}
}