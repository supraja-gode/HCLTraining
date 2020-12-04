package collections9;

import java.util.*;

public class Sortlist implements Comparable<Sortlist>{
	String name;
	String contactNumber;
	Double costperday;
	String ownerName;
	public Sortlist() {
		// TODO Auto-generated constructor stub
	}
	public Sortlist(String name, String contactNumber, Double costperday, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costperday = costperday;
		this.ownerName = ownerName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Double getCostperday() {
		return costperday;
	}
	public void setCostperday(Double costperday) {
		this.costperday = costperday;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public int compareTo(Sortlist sO) {
		Double value = ((Sortlist)sO).getCostperday();
		return (int) (value-this.costperday);
	}
	@Override
	public String toString() {
		return "Sortlist [name=" + name + ", contactNumber=" + contactNumber + ", costperday=" + costperday
				+ ", ownerName=" + ownerName + "]";
	}
}
