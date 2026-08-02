package model;

public class Toy {
	private String id;
	private String name;
	private double price;
	private int quantity;
	
	public Toy (String id, String name, double price, int quantity) {
		setId(id);
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}
	
	public void  setId (String id) {
		this.id = id;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice( double price) {
		if ( price <= 0) {
			System.out.print("Gia ban khong hop le !");
			return;
		}
		this.price = price;
	}
    public int getQuantity() {
    	return quantity;
    }
	public void setQuantity( int quantity) {
		if (quantity < 0) {
			System.out.print("So luong khong hop le !");
			return;
		}
	this.quantity = quantity;
	}
	
	public double calculateDiscount() {
		return 0;
	}
	
	public void printInfor() {
		System.out.println("THONG TIN DO CHOI :");
		System.out.println("Ma id: " + id);
		System.out.println("Name : " + name );
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quantity );
	}
}
