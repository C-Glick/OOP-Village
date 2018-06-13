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
	}
	
	public void reportStats() {
		System.out.println("location: "+street);
		System.out.println("size: "+size);
		System.out.println("Owner: " +owner.name);
		System.out.println("cost: "+cost);
	}
	

}
