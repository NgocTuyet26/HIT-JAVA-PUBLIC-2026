package bai3;
import bai1.Smartphone;

import bai2.Customer;

import java.util.ArrayList;
public class Store {
    private ArrayList<Smartphone> inventory ;

    public Store(){
        this.inventory = new ArrayList<>();
    }

    public void addPhoneToStore(Smartphone phone){
        inventory.add(phone);
    }

    public Smartphone search(String id) {
        for (Smartphone smartphone : inventory) {
            if (smartphone.getId().equals(id)) {
                return smartphone;
            }
        }

        return null;
    }

    public ArrayList<Smartphone> search(double minPrice, double maxPrice) {
        ArrayList<Smartphone> result = new ArrayList<>();

        for (Smartphone phone : inventory) {
            if (phone.getPrice() >= minPrice
                    && phone.getPrice() <= maxPrice) {
                result.add(phone);
            }
        }

        return result;
    }

    public ArrayList<Smartphone> search(String keyword, boolean isName) {
        ArrayList<Smartphone> result = new ArrayList<>();

        for (Smartphone phone : inventory) {
            if (phone.getName().toLowerCase()
                    .contains(keyword.toLowerCase())) {
                result.add(phone);
            }
        }

        return result;
    }

    public ArrayList<Smartphone> getInventory() {
        return new ArrayList<>(inventory);
    }

    // bai 4
    public void sellPhone(Customer customer,String phoneId){
        Smartphone phone = search(phoneId);

        if (phone.getStock() == 0){
            System.out.println("Het hang !");
            return;
        }else{
            phone.setStock(phone.getStock()- 1) ;
            customer.addPhone(phone);
            System.out.println("Da ban !");
        }

    }
    //bai5
    public double calculateInventoryValue(){
        double total = 0;
        for ( Smartphone phone : inventory){
            total += phone.getFinalPrice() * phone.getStock();
        }
        return total;
    }

}



