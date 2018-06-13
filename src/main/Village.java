package main;

public class Village {
	String name = "Oakheart";
	String state = "IA";

	public Village(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}

	
	public static void main(String[] args) {
		Village oakheart = new Village("OakHeart","IA");
		
		Villager becky = new Dog("Becky",30, 10000);
		Villager tom = new Dog("Tom", 10, 6000);
		
		Mayor mayor = new Mayor(becky, 1, 100000, oakheart);
		
		tom.reportMoney();
		//tom.buildHouse("Main", 5000, 5783);
		tom.reportMoney();
		
		becky.buildHouse("1st", 8000, 7000);
		tom.house.reportStats();
		becky.house.reportStats();
	}

}
