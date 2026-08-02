package app;

import model.Toy;
import model.PlushToy;
import model.ElectronicToy;

public class Main {

	public static void main(String[] args) {
		Toy [] arr = new Toy[3];
		arr[0] = new Toy("abc","Bo xep hinh",600,60);
		arr[1] = new ElectronicToy("123","Robot thong minh",700,70,12);
		arr[2] = new PlushToy("456","Gau bong Teddy",800,80,"Bong gon");
	 for ( int i = 0; i < arr.length; i++) {
		 arr[i].printInfor();
		 System.out.println();
	 }
	}
}
