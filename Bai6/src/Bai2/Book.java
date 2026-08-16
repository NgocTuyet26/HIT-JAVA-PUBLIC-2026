package bai2;

class Book extends Product{
    private String author;
    private int pages;

    public Book(String id, String name,double price,String author,int pages){
        super(id,name,price);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public double getDiscountedPrice(){
        return 0.9 * price;
    }

    @Override
    public void showInfo(){
        System.out.println("BOOK : ");
        System.out.println("Ma sach : " + id);
        System.out.println("Ten sach : " + name);
        System.out.println("Tac gia : " + author );
        System.out.println("So trang : " +pages);
        System.out.println("Gia sach : " + price);
        System.out.println("Gia sach sau khi giam 10% : " + getDiscountedPrice());

    }

    @Override
    public String toString(){
        return "Book { id : " + id + ",name : " + name + ",tac gia : " + author + ",so trang :" + pages + ",price : " + price + "}";
    }

}
