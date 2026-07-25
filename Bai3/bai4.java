import java.util.Scanner;
public class bai4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A,B,C;
        do { 
            System.out.print("Nhap A=");
            A = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhap B=");
             B = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhap C=");
            C = Integer.parseInt(scanner.nextLine());

            if( A == B || B == C || C == A){
                System.out.println("Ba so khong phan biet.Nhap lai.");
            } 
        } while (A == B || B == C || C == A);

        System.out.print("A =" + A);
        System.out.print("B =" + B);
        System.out.print("C =" + C);

        int TV = ((A > B && A < C) || (A < B && A > C))
        ? A
        : (((B > A && B < C) || (B < A && B > C))
            ? B
            : C);
            System.out.println("Trung vi:" + TV);
        }



    }
