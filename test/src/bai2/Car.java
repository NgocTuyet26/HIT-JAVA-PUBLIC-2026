package bai2;

import bai1.Manufacturer;
import bai1.Vehicle;

public abstract class Car extends Vehicle {
    private boolean luxury;

    public Car (double price, String id, int quantity, Manufacturer manufacturer) {
        super(price, id, quantity, manufacturer);
        this.luxury = luxury;
    }

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }
    @Override
    public double getDiscountPrice(){
        return  getPrice();
    }

    public void logLuxury(){
        if (luxury){
            System.out.println("Nha san xuat : " + manufacturer.getName());

        }
    }

}