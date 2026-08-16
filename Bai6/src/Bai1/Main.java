package bai1;

public class Main {
    public static void main(String [] args){
        Customer customer = new Customer("Ngoc Tuyt","123456","Ha Noi");

        Order order = new Order ("DH001", customer);

        Product p1 = new Product("SP01", "Laptop", 15000000, 1);
        Product p2 = new Product("SP02", "Chuot", 500000, 2);
        Product p3 = new Product("SP03", "Ban phim", 1000000, 1);

        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        order.printInfo();
        System.out.println("Tong so tien : " + order.getTotal());
    }
}
