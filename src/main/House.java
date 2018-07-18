package main;

public class House {
	String street;
	int size;
	Villager owner;
	int cost;
	
	public House(String street, int size, Villager owner, int cost) {
		super();
		this.street = street;
		this.size = size;
		this.owner = owner;
		this.cost = cost;
		Village.houseList.add(this);
	}
	
	public void reportStats() {
		Village.ui.print("location: "+street);
		Village.ui.print("size: "+size);
		Village.ui.print("Owner: " +owner.name);
		Village.ui.print("cost: "+cost);
	}
	

}
