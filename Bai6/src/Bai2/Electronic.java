package bai2;
 class Electronic extends Product{
     private int warrantyMonths;

     public Electronic ( String  id, String name, double price, int warrantyMonths){
         super(id,name,price);
         this.warrantyMonths = warrantyMonths;
     }

     @Override
     public double getDiscountedPrice(){

         return 0.95 * price;
     }

     public void showInfo(){
         System.out.println("ELECTRONIC : ");
         System.out.println("Ma Electronic : " + id);
         System.out.println("Ten Electronic : " + name);
         System.out.println("So thang bao hanh : " +  warrantyMonths);
         System.out.println("Gia Electronic : " + price);
         System.out.println("Gia Electronic sau khi giam 5% : " + getDiscountedPrice());

     }
     @Override
     public String toString(){
         return "San pham { id : " + id + ",name : " + name + ",warrantyMonths : " + warrantyMonths +",price" +  price + "}";
     }


 }

