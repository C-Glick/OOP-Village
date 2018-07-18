package main;

public class Mayor extends Villager {
	int yearsInOffice;
	int budget;
	Village town;
	
	public Mayor(String name, int age, int money, int yearsInOffice, int budget, Village town) {
		super(name, age, money);
		this.yearsInOffice = yearsInOffice;
		this.budget = budget;
		this.town = town;
		Village.mayor = this;
	}
	public void reportStats() {
		Village.ui.print("Villager: "+this.name);
		Village.ui.print("Years in office: "+yearsInOffice);
		Village.ui.print("Budget: "+budget);
		Village.ui.print("Town: "+town.name);
	}
	public void setYearsInOffice(int years) {
		this.yearsInOffice = years;
	}
	public void setBudget (int budget) {
		this.budget = budget;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}
	

}
