package bai2;

import bai1.Manufacturer;
import bai1.Vehicle;

public abstract class Motorbike extends Vehicle {
    public Motorbike(double price, String id, int quantity, Manufacturer manufacturer) {
        super(price, id, quantity, manufacturer);
    }

    @Override
    public double getDiscountPrice(){
        return 0.9 * getPrice();
    }
}






