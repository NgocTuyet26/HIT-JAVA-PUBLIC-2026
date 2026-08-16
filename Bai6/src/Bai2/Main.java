package bai2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Book("B01", "Lap trinh Java", 200000, "Nguyen Van A", 350));
        products.add(new Book("B02", "Lap trinh Python", 180000, "Tran Van B", 300));
        products.add(new Electronic("E01", "Laptop Dell", 20000000, 24));
        products.add(new Electronic("E02", "Dien thoai Samsung", 10000000, 12));
        products.add(new Food("F01", "Sua tuoi", 30000, "20/08/2026"));

        for (Product product : products) {
            product.showInfo();
            System.out.println(product);
            System.out.println();
        }

        double totalOriginalPrice = 0;
        double totalDiscountedPrice = 0;

        for (Product product : products) {
            totalOriginalPrice += product.price;
            totalDiscountedPrice += product.getDiscountedPrice();
        }

        System.out.println("Tong gia tri kho hang: " + totalOriginalPrice);
        System.out.println("Tong gia tri sau khi giam gia : " + totalDiscountedPrice);
    }
}