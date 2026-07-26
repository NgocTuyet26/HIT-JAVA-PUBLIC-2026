// BAI 4
import java.util.Scanner;
public class ScoreManage{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int n = Integer.parseInt(scanner.nextLine());

        double[] scores = new double [n];
        for( int i = 0; i < n; i++){
            System.out.print("Nhap diem cua hoc sinh thu " + ( i + 1) + ":");
            scores[i] = Double.parseDouble(scanner.nextLine());

            while ( scores[i] < 0 || scores[i] > 10){
                System.out.println("Diem kkhong hop le, nhap lai ");
                scores[i] = Double.parseDouble(scanner.nextLine());
            }

        }
        System.out.println("Diem cao nhat: " + findMax(scores));
        System.out.printf(" Diem trung binh lop: %.2f%n", calculateAverage(scores));
        System.out.println("So hoc sinh duoi trung binh: " + countFailedStudents(scores));

    }
        // Tim diem cao nhat :
        public static double findMax(double[] arr ){
            double max = arr [0];
            for ( int i = 1; i < arr.length; i++){
                if ( arr[i] > max){
                    max = arr[i];
                }
            }
            return max;

        }

        // Tinh diem TBC :
        public static double calculateAverage(double [] arr){
            double sum = 0;
            for ( int i = 0 ; i < arr.length ; i++){
                sum += arr[i];
            }
            return sum / arr.length;
        }

        //so diem trung binh
        public static int countFailedStudents(double[] arr){
            int count = 0;
            for (double scores : arr){
                if ( scores < 5.0){
                    count ++ ;
                }
            }
            return count;
        }
        
}
       


    

