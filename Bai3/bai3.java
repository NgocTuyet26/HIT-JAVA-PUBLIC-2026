import java.util.Scanner;
public class bai3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = (int)(Math.random() *101);
        System.out.println("Nhap b:");
        int b = (int)(Math.random() *101);
        System.out.println("Nhap c:");
        int c = (int)(Math.random() *201);

        System.out.println(a + " + " + b + " = " + c);

        System.out.print("Nhap cau trl (phep tinh dung / phep tinh sai)");
        String answer = scanner.nextLine();

        if ( a + b == c){
            if(answer.equalsIgnoreCase("phep tinh dung")){
                System.out.print("Ban trl dung");
            }
            else{
                System.out.print("Ban trl sai");
            }
        }else{
            if(answer.equalsIgnoreCase("phep tinh sai")){
                System.out.print("Ban trl dung");
            }
            else{
                System.out.print("Ban trl sai");
            }
            }
        }

    }
