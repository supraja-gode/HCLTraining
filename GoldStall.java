package stalls;

public class GoldStall implements Stalls {
		private String stallName;
		private int cost;
		private String ownerName;
		private int tvSet;
		
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
		public int getTvSet() {
			return tvSet;
		}
		public void setTvSet(int tvSet) {
			this.tvSet = tvSet;
		}
		public GoldStall() {
			// TODO Auto-generated constructor stub
		}
		public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
			super();
			this.stallName = stallName;
			this.cost = cost;
			this.ownerName = ownerName;
			this.tvSet = tvSet;
		}
		@Override
		public void display(String stallName, int cost, String ownerName, int tvSet) {
			System.out.println("Stall Name: "+stallName);
			System.out.println("Cost: "+cost);
			System.out.println("Owner Name: "+ownerName);
			System.out.println("Number of tv sets: "+tvSet);			
		}
	}
