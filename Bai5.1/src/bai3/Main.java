package bai3;

import java.util.ArrayList;
import bai1.Smartphone;

public class Main {
    public static void main(String[] args) {


        Store store = new Store();

        Smartphone phone1 =new Smartphone("iPhone 15", 20000000, 10);
        Smartphone phone2 = new Smartphone("Samsung S24", 18000000, 5);
        Smartphone phone3 =new Smartphone("Xiaomi 14", 12000000, 8);
        Smartphone phone4 = new Smartphone("iPhone 13", 15000000, 7);
        Smartphone phone5 =new Smartphone("Oppo  11", 10000000, 6);


        store.addPhoneToStore(phone1);
        store.addPhoneToStore(phone2);
        store.addPhoneToStore(phone3);
        store.addPhoneToStore(phone4);
        store.addPhoneToStore(phone5);

        Smartphone result1 = store.search("SP1");

        if (result1 != null) {
            System.out.println("Tim thay:");
            System.out.println("ID: " + result1.getId());
            System.out.println("Ten: " + result1.getName());
            System.out.println("Gia: " + result1.getPrice());
        } else {
            System.out.println("Khong tim thay!");
        }



        ArrayList<Smartphone> result2 =store.search(12000000, 18000000);

        System.out.println("Cac dien thoai co gia tu 12tr den 18tr:");

        for (Smartphone phone : result2) {
            System.out.println(
                    phone.getId() + " - "+ phone.getName() + " - "+ phone.getPrice()
            );
        }



        ArrayList<Smartphone> result3 = store.search("iPhone", true);

        System.out.println("Cac dien thoai co ten chua 'iPhone':");

        for (Smartphone phone : result3) {
            System.out.println(phone.getId() + " - "+ phone.getName() + " - "+ phone.getPrice()
            );
        }
    }
}
