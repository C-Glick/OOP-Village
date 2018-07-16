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
		Village.villagerList.add(this);
	}

	public abstract void move();
	public abstract void talk();
	
	public void sleep() {
		Village.ui.print("Sleeping...");
	}
	
	public void eat(){
		Village.ui.print("Eating...");
		}
	
	public void buildHouse(String street, int size, int cost) {
		if(this.money>=cost) {
			this.house= new House(street, size, this, cost);
			Village.ui.print(this.name+" built a house on "+street+" Street for $"+cost+", it is "+size+" square ft.");	
			this.money=this.money-this.house.cost;
		}else {
			Village.ui.print(this.name+" does not have enough money to build this house.");
			this.reportMoney();
			Village.ui.print("House cost: $"+cost);
		}
	
	}
	
	public void reportMoney() {
		Village.ui.print(this.name+" has $"+this.money);
	}
	public void moveHouse(String newStreet) {
		this.house.street = newStreet;
	}
	public void pay (Villager reciver, int amount) {
		if (amount <= this.money) {
			this.money = this.money-amount;
			reciver.money = reciver.money + amount;
			Village.ui.print(this.name + " payed "+ reciver.name +" $"+amount);
		}
		else{
			Village.ui.print(this.name +"does not have enough money to pay "+reciver.name+" $"+amount);
			this.reportMoney();
		}
	}
}