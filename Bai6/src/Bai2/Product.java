package bai2;

public class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name,double price){
        this.id = id ;
        this.name = name;
        this.price = price;
    }
    public double getDiscountedPrice(){
        return price;
    }


    public void showInfo(){
        System.out.println("THONG TIN SN PHAM : ");
        System.out.println("Ma san pham : " + id);
        System.out.println("Ten san pham : " + name);
        System.out.println("Gia san pham : " + price);
        System.out.println("Gia san pham sau khi giam gia : " + getDiscountedPrice());

    }
    @Override
    public String toString(){
        return "San pham { id : " + id + ",name : " + name + ",price : " + price + "}";
    }


}
