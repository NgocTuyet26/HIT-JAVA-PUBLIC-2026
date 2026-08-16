package bai3;

public class Main {
    public static void main(String[] args) {

        double orderPrice = 2_000_000;

        Address a1 = new Address("Nguyen Trai", "Ha Noi", "100000");
        Address a2 = new Address("Le Loi", "Ha Noi", "100001");
        Address a3 = new Address("Tran Hung Dao", "Ha Noi", "100002");

        NormalAccount normal = new NormalAccount("normal", "normal@gmail.com", a1);
        VipAccount vip1 = new VipAccount("vip1", "vip1@gmail.com", a2, 500);
        VipAccount vip2 = new VipAccount("vip2", "vip2@gmail.com", a3, 1500);

        System.out.println(normal);
        System.out.println("Tien phai tra: " + orderPrice * (1 - normal.getDiscount()));

        System.out.println();

        System.out.println(vip1);
        System.out.println("Tien phai tra: " + orderPrice * (1 - vip1.getDiscount()));

        System.out.println();

        System.out.println(vip2);
        System.out.println("Tien phai tra: " + orderPrice * (1 - vip2.getDiscount()));

        System.out.println();

        vip1.addPoints(600);
    }
}
