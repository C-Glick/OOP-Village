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
		Village.mayor = this;
	}
	public void reportStats() {
		System.out.println("Villager: "+villager.name);
		System.out.println("Years in office: "+yearsInOffice);
		System.out.println("Budget: "+budget);
		System.out.println("Town: "+town.name);
	}
	public Villager getMayor() {
		Villager mayor = this.villager;
		return mayor;
	}
	public void setYearsInOffice(int years) {
		this.yearsInOffice = years;
	}
	public void setBudget (int budget) {
		this.budget = budget;
	}
	

}
