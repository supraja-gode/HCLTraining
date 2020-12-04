import java.util.Comparator;

public class TicketBooking implements Comparator<TicketBooking> {

	private String name;
	private Integer price;
	public TicketBooking() {
		// TODO Auto-generated constructor stub
	}
public TicketBooking(String name, Integer price) {
	super();
	this.name = name;
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
	this.price = price;
}

@Override
public int compare(TicketBooking o1, TicketBooking o2) {
// TODO Auto-generated method stub
	return o1.getPrice().compareTo(o2.getPrice());
}
}