package bai1;

public class Smartphone {
    private static int totalPhones = 0;
    private String id;
    private String name;
    private double price;
    private int stock;
    // bai 5
    private static double vatTax = 0.10;

    public Smartphone(String name,double price,int stock){
        totalPhones += 1;
        this.id = "SP" + totalPhones;
        this.name = name;
        this.price = price;
        this.stock = stock;

    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Gia khong hop le !");
            this.stock = 0;
        } else {
            this.price = price;
        }
    }

    public int getStock(){
        return stock;
    }

    public void   setStock(int stock){
        if (stock < 0){
            System.out.println("Hang ton khong hop le !");
            this.stock = 0;
        }
        else{
            this.stock = stock;

        }
    }

    public static int getTotalPhones(){
        return totalPhones;
    }

    //bai5
    public static void setVatTax(double tax){
        vatTax = tax;
    }
    public double getFinalPrice(){
        return price + price * vatTax;
    }





}
