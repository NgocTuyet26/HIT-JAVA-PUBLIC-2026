package bai4;
import bai1.Smartphone;
import bai2.Customer;
import bai3.Store;

import java.util.ArrayList;

public class StoreAndCustomer {
    public static void main(String [] args){
        Store store = new Store();
        Customer customer = new Customer("Anh Toan");

        Smartphone phone = new Smartphone("IP 15",20000000,15);

        store.addPhoneToStore(phone);

        System.out.print("Gia ban dau :" + phone.getPrice());
        System.out.print("Stock ban dau : " + phone.getStock());

        store.sellPhone(customer,phone.getId());
        System.out.println("Sau khi ban.Stock trong kho :" + phone.getStock() + " so sp trong gio " + customer.getCart().size());

        Smartphone phoneInstore = store.search(phone.getId());
        phoneInstore.setPrice(25000000);

        Smartphone phoneInStore = customer.getCart().get(0);
        System.out.println( "Gia trong gio hang : " + phoneInStore.getPrice());


    }


}
