package model;

public class PlushToy extends Toy {
	private String material;
	
	public PlushToy(String id, String name, double price, int quantity, String material) {
		super(id, name,price,quantity);
		setMaterial(material);
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
    }
	
	@Override
	public double calculateDiscount(){
		return getPrice() * 0.01;
	}
	
	@Override
	public void printInfor() {
		super.printInfor();
		System.out.println("Material: " + material);
		System.out.println("Discount : " + calculateDiscount() );
		
	}
	
}
