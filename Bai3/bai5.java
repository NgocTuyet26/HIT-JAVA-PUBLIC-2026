import java.util.Scanner;
public class bai5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so ngon nui N =");
        int N = Integer.parseInt(scanner.nextLine());
        int [] arr = new int [N];
        System.out.println("Nhap do cao cua " + N +" ngon nui.");
        for( int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(scanner.nextLine());
            
        }        
        int index = 0;
        int count = 0;
        for(int x : arr){
            if(index != 0 && index != arr.length-1){
                if(x > arr[index - 1] && x > arr[index + 1]){
                    count ++;
                }
            }
            index ++;
        }
        System.out.print("So dinh nui:" + count);

    }
}