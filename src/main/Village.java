package main;

public class Village {

	public static void main(String[] args) {
		
		Villager becky = new Dog("Becky",30, 10000);
		Villager tom = new Dog("Tom", 10, 6000);
		
		tom.reportMoney();
		//tom.buildHouse("Main", 5000, 5783);
		tom.reportMoney();
		
		becky.buildHouse("1st", 8000, 7000);
		tom.house.reportStats();
		becky.house.reportStats();
	}

}
