package bai2;
public class Food extends Product {
    private String expiryDate;

    public Food(String id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double getDiscountedPrice() {
        return price;
    }

    @Override
    public void showInfo() {
        System.out.println(" FOOD ");
        System.out.println("Ma Food: " + id);
        System.out.println("Ten Food: " + name);
        System.out.println("Han su dung: " + expiryDate);
        System.out.println("Gia Food: " + price);

    }

    @Override
    public String toString() {
        return "Electronic{id='" + id + "', name='" + name + "', price=" + price + ", expiryDate : " + expiryDate + "}";
    }
}