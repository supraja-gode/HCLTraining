package org.hcl;

public class ItemType {
	private String name;
	private double deposit;
	private double costPerDay;
	public ItemType() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String toString()
	{
		return String.format("Name: %s, Deposit: %d, CostPerDay: %d",getName(), getDeposit(), getCostPerDay());
	}
	
}
	
