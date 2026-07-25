
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        String str = scanner.nextLine();

        boolean doiXung = true;
        for( int i = 0; i < str.length() /2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
            doiXung = false;
            break;
            }
        }
        if(doiXung){
            System.out.println("Chuoi doi xung:" + str.toUpperCase());
        }else{
            System.out.println("Chuoi khong doi xung:" + str.toLowerCase());
        }
    }
}