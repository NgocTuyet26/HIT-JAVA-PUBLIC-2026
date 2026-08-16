package bai5;
import bai1.Smartphone;
import bai2.Customer;
import bai3.Store;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Store store = new Store();
        Customer customer = new Customer("Co Phuong Hang mua tat :)) ");
        Smartphone phone1 = new Smartphone("iPhone 15", 20000000, 10);
        Smartphone phone2 = new Smartphone("Samsung S24", 15000000, 5);
        Smartphone phone3 = new Smartphone("Xiaomi 14", 10000000, 8);

        store.addPhoneToStore(phone1);
        store.addPhoneToStore(phone2);
        store.addPhoneToStore(phone3);

        store.sellPhone(customer, phone1.getId());
        store.sellPhone(customer, phone2.getId());

        System.out.println("Tai muc thue : 10 %");
        System.out.println("Tong tien khach hang phai tra : " + customer.calculateTotalBill());
        System.out.println("Gia tri cua sp trong kho : "+ store.calculateInventoryValue());

        System.out.println(" \n Nha nuoc giam xuong 8 % : ");
        Smartphone.setVatTax(0.08);
        System.out.println("Tong tien khach hang phai tra : " + customer.calculateTotalBill());
        System.out.println("Gia tri cua sp trong kho : "+ store.calculateInventoryValue());


    }
}
