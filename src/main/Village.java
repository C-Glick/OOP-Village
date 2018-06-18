package main;

public class Village {
	String name;
	String state;

	public Village(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}

	
	public static void main(String[] args) throws InterruptedException {
		Clock clock= new Clock();
		clock.start();
		
		Village oakheart = new Village("OakHeart","IA");
		
		Villager becky = new Dog("Becky",30, 10000);
		Villager tom = new Dog("Tom", 10, 6000);
		
		Mayor mayor = new Mayor(becky, 1, 100000, oakheart);
		
		mayor.reportStats();
	
		
		tom.reportMoney();
		//tom.buildHouse("Main", 5000, 5783);
		tom.reportMoney();
		
		becky.buildHouse("1st", 8000, 7000);
		tom.house.reportStats();
		mayor.getMayor().house.reportStats();	
		
		clock.printTime();
		Thread.sleep(5000);
		clock.printTime();
		}

}
