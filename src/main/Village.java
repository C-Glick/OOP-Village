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
	static List<House> houseList;
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
		houseList = new ArrayList<>();
		
		Thread.sleep(500);
		
		
		Mayor mayorBecky = new Mayor("Becky", 30, 10000, 5, 50000, oakheart);
		Villager tom = new Dog("Tom", 10, 6000);
		
		mayor.reportStats();
	
		tom.reportMoney();
		tom.buildHouse("Main", 5000, 5783);
		tom.reportMoney();
		
		mayorBecky.buildHouse("1st", 8000, 7000);
		tom.house.reportStats();
		mayor.house.reportStats();	
		oakheart.worldClock.printTime();
	}
}
