// BAI 2
import java.util.Scanner;
public class TriangleClassifier{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a = ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap canh b = ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap canh c = ");
        int c = Integer.parseInt(scanner.nextLine());

        if ( a + b > c && a + c > b && b + c > a){
            System.out.println("Ba canh da nhap tao thanh mot tam giac hop le ");
            if (a == b && b == c){
                System.out.println("Tam giac deu");
            }
            else if (a == b || b == c || a == c){
                System.out.println("Tam giac can");
            }
            else if ( a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
                System.out.println("Tam giac vuong");
            }
            else {
                System.out.println("Tam giac thuong");
            }
        int chuVi = a + b + c;
        double p = chuVi / 2.0;
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Chu vi tam giac la: " + chuVi);
        System.out.print("Dien tich tam giac la: " + dienTich);
        }
        else {
            System.out.print(" Ba canh da nhap khong tao thanh mot tam giac hop le");
        }
    }

}