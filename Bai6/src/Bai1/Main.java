
public class Main {
    public static void main(String [] args){
        Customer customer = new Customer("A", "1234","Ha Noi");
        Order order = new Order("DH01", customer);
        Product p1 = new Product(
                "SP01",
                "Tai nghe",
                500000,
                2
        );

        Product p2 = new Product(
                "SP02",
                "Ban phim",
                800000,
                1
        );

        Product p3 = new Product(
                "SP03",
                "Chuot",
                300000,
                3
        );
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        // In hóa đơn
        order.printInvoice();
    }



}
