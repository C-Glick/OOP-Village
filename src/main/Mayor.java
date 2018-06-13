package main;

public class Mayor {
	Villager villager;
	int yearsInOffice;
	int budget;
	Village town;
	
	public Mayor(Villager villager, int yearsInOffice, int budget, Village town) {
		super();
		this.villager = villager;
		this.yearsInOffice = yearsInOffice;
		this.budget = budget;
		this.town = town;
	}

}
