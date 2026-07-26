// BAI 3
import java.util.Scanner;
public class PasswordValidator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mat khau:");
        String password = scanner.nextLine();

        String cleanedPassword = password.trim();
        int length = cleanedPassword.length();

        boolean hasDigit = false;
        boolean hasUpper = false;
        

        for ( int i = 0 ; i < length ;i++){
            char c = cleanedPassword.charAt(i);
            if ( c > '0' && c < '9'){
                hasDigit = true;
            }
            if ( c > 'A' && c < 'Z'){
                hasUpper = true;
            }
        }
        if (! hasDigit){
            System.out.println("Mat khau phai chua it nhat 1 chu so");
        }
        if(! hasUpper){
            System.out.println("Mat khau phai chua it nhat 1 chu cai viet hoa");
        }
        if(length < 8){
            System.out.println("Mat khau sau khi loai bo khoang trang hai dau phai co do dai toi thieu la 8 ky tu");
        }
        if(hasDigit && hasUpper && length >= 8){
            System.out.println("Mat khau hop le");
        }
        else{
            System.out.println("Mat khau khong hop le");
        }
    }
}
