package practice.linkedlist;

public class Customer {

	private int id;
	private String name;
	private int phoneNumber;
	
	Customer(int id, String name, int phone) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
