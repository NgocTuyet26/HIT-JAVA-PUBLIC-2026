import java.util.Scanner;
public class bai1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh r:");
        float r = Float.parseFloat(scanner.nextLine());
        while ( r < 0 || r >= 1000){
            System.out.println("Ban kinh khong hop le.Nhap lai r:");
            r = Float.parseFloat(scanner.nextLine());
        }
        float pi = 3.14f;
        float chuVi = 2 * pi * r;
        float dienTich = pi * r * r;
        System.out.printf("Chu vi hinh tron: .%3f",chuVi," ");
        System.out.printf("Dien tich hinh tron: .%3f",dienTich);
        }
        }

