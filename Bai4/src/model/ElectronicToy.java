package model;

public class ElectronicToy extends Toy {
	private int warranty;
	
	public ElectronicToy(String id, String name, double price, int quantity,int warranty) {
		super (id, name,price,quantity);
		setWarranty(warranty);
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	@Override
	public double calculateDiscount() {
		if ( getPrice() > 500.0) {
			return getPrice() * 0.05;
		}
		return 0;
	}
	@Override
	public void printInfor(){
		super.printInfor();
		System.out.println("Wrranty :" + warranty + "thang");
		System.out.println("Discount : " + calculateDiscount());
	}
	
	
}
