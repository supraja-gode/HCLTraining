package stalls;

public class PremiumStall implements Stalls{
	private String stallName;
	private int cost;
	private String ownerName;
	private int projector;
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}

	
	public PremiumStall() {
	}
	public PremiumStall(String stallName, int cost, String ownerName, int projector) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
	}
	
	@Override
	public void display(String stallName, int cost, String ownerName, int projector) {
		System.out.println("Stall Name: "+stallName);
		System.out.println("Cost: "+cost);
		System.out.println("Owner Name: "+ownerName);
		System.out.println("Number of tv sets: "+projector);
	}
}
