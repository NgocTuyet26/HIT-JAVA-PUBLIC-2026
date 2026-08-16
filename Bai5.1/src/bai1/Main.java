package bai1;

public class Main{
    public static void main(String[] args){
        Smartphone phone1 = new Smartphone("Iphone 11",8000000,11);
        Smartphone phone2 = new Smartphone("Iphone 12",12000000,12);
        Smartphone phone3 = new Smartphone("Iphone 13",13000000,13);

        System.out.println("1." + phone1.getId());
        System.out.println("2." + phone2.getId());
        System.out.println("3." + phone3.getId());

        System.out.println("Tong so Smartphone :" + Smartphone.getTotalPhones());



    }
}

