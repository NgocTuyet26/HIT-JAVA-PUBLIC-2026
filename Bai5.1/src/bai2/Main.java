package bai2;

import bai1.Smartphone;

public class Main {
    public static void main(String [] args){
        Customer customer = new Customer("Ngoc Tuyt");

        Smartphone phone1 = new Smartphone("IP 12",12000000,1);
        Smartphone phone2 = new Smartphone("IP 13", 13000000,1);

        customer.addPhone(phone1);
        customer.addPhone(phone2);

        System.out.println("Sl Smartphone ban dau cua Ngoc Tuyt :"+ customer.getCart().size());
        customer.getCart().clear();
        System.out.println(" SL Smartphone sau khi clear :" + customer.getCart().size());


    }
}
