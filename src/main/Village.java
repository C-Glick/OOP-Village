package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Village {
	String name;
	String state;
	static Mayor mayor;
	static Clock worldClock;
	static List<Villager> villagerList;
	static UserInterface ui;

	public Village(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}

	
	public static void main(String[] args) throws InterruptedException {
		Village oakheart = new Village("OakHeart","IA");
		Clock clock= new Clock(oakheart);
		ui= new UserInterface(oakheart);
		clock.start();
		worldClock=clock;
		ui.start();
		villagerList = new ArrayList<>();
		
		Thread.sleep(500);
		
		
		Villager becky = new Dog("Becky",30, 1000);
		Villager tom = new Dog("Tom", 10, 6000);
		
		Mayor mayorBecky = new Mayor(becky, 1, 100000, oakheart);
		
		mayor.reportStats();
	
		tom.reportMoney();
		tom.buildHouse("Main", 5000, 5783);
		tom.reportMoney();
		
		becky.buildHouse("1st", 8000, 7000);
		tom.house.reportStats();
		mayor.getMayor().house.reportStats();	
		oakheart.worldClock.printTime();
	}
}
