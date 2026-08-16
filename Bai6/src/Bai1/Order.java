package bai1;
import java.util.ArrayList;

public class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product>items;
    private int count ;

    public Order(String orderId,Customer customer){
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();

    }
    public void addProduct(Product p){
       items.add(p);
    }
    public double getTotal(){
        double total = 0;
        for (Product p : items){
            total += p.getSubtotal();
        }
        return total;
    }
    public void printInfo(){
        System.out.println("HOA DON :");
        System.out.println("Ma don hang : " + orderId );
        System.out.println();

        System.out.println("THONG TIN KHACH HANG:");
        System.out.println("Ten : " + customer.getName());
        System.out.println("Phone : " + customer.getPhone());
        System.out.println("Dia chi : " + customer.getAddress() );
        System.out.println();

        System.out.println("THONG TIN DON HANG : ");
        for ( int i = 0 ; i < items.size(); i++){
            Product p = items.get(i);

            System.out.print(i + 1 + ".");
            System.out.println("Ten: " + p.getName());
            System.out.println("Don gia: " + p.getPrice());
            System.out.println("So luong: " + p.getQuantity());
            System.out.println("Thanh tien: " + p.getSubtotal());
            System.out.println();
        }

        System.out.println("Tong tien: " + getTotal());


        }



    }

