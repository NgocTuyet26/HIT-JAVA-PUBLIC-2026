package bai2;
import java.util.ArrayList;
import bai1.Smartphone;


public class Customer {
    private String customerName;
    private ArrayList<Smartphone>cart;

    public Customer( String customerName){
        this.customerName = customerName;
        this.cart = new ArrayList<>();
    }

    public String getCustomerName(){
        return customerName;
    }

    public void addPhone (Smartphone phone){
        cart.add(phone);
    }

    public void removePhone ( String id ){
        for ( int i = 0 ; i < cart.size(); i++){
            if ( cart.get(i).getId().equals(id)){
                cart.remove(i);
                return;
            }
        }
        System.out.println("Khong tim thay Smartphone co ID: " + id);
    }

    public void removePhone(int index){
        if ( index >= 0 && index < cart.size()){
            cart.remove(index);
        }
        else {
            System.out.print("Index khong hop le !");
        }
    }


    public ArrayList<Smartphone>getCart() {
        return new ArrayList<>(cart);

    }

    //bai5
    public double calculateTotalBill(){
        double total = 0;
        for ( Smartphone phone : cart){
            total += phone.getFinalPrice();
        }
        return total;
    }
}


