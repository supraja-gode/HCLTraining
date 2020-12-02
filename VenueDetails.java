package venuedetails;

public class VenueDetails {
	String name;
	String city;
	String name1;
	String city1;
	int choice;
	public VenueDetails() {
		// TODO Auto-generated constructor stub
	}
	public VenueDetails(String name, String city, String name1, String city1, int choice) {
		super();
		this.name = name;
		this.city = city;
		this.name1 = name1;
		this.city1 = city1;
		this.choice = choice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	}
	