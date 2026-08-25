package bai1;

interface Discountable{
    double getDiscountPrice();

}

public abstract class Vehicle {
    private String id ;
    private double price;
    private int quantity;
    protected Manufacturer manufacturer;

    public Vehicle(double price, String id, int quantity, Manufacturer manufacturer) {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public abstract double getDiscountPrice();

    public void displayInfo(){
        System.out.print("ID :" + id);
        System.out.println("Gia :" + price);
        System.out.print(" So luong :" + quantity);

    }

}

