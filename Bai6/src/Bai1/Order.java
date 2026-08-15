

public class Order {
    private String orderId;
    private Customer customer;
    private Product[] items = new Product[10];
    private int count = 0;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addProduct(Product p) {
        if (count < items.length) {
            items[count] = p;
            count++;
        } else {
            System.out.println("DS da day !");
        }
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getPrice() * items[i].getQuantity();
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("THONG TIN KHACH HANG");
        System.out.println(" Ma id : " + orderId);
        System.out.println("Name : " + customer.getName());
        System.out.println("Phone : " + customer.getPhone());
        System.out.println(" Address : " + customer.getAddress());

        System.out.println("DANH SACH SAN PHAM");
        for (int i = 0; i < count; i++) {
            Product p = items[i];
            System.out.println((i + 1) + "." + p.getName());
            System.out.println("Price : " + p.getPrice());
            System.out.println("Quantity : " + p.getQuantity());
            System.out.println("Bill: " + p.getPrice() * p.getQuantity());
        }
        System.out.print("Total: " + getTotal());
    }
}
