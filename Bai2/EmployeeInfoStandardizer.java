// BAI 5
import java.util.Scanner;

public class EmployeeInfoStandardizer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap thong tin nhan vien: ");
        String rawInput = scanner.nextLine();

        // 1. Loại bỏ khoảng trắng đầu cuối và tách chuỗi theo dấu "-"
        String[] parts = rawInput.trim().split("-");

        if (parts.length < 4) {
            System.out.println("Thong tin nhap vao khong dung dinh dang!");
            return;
        }

        // 2. Trích xuất các trường thông tin
        String code = parts[0].trim();
        String rawName = parts[1].trim();
        String rawYear = parts[2].trim();
        String department = parts[3].trim();

        // 3. Chuẩn hóa họ tên
        String formattedName = capitalizeName(rawName);

        // 4. Kiểm tra phòng ban
        String dep = department.toLowerCase();

        if (dep.contains("ky thuat") || dep.contains("kỹ thuật")) {
            System.out.println("Phan loai: Nhan vien ky thuat");
        } else {
            System.out.println("Phan loai: Nhan vien nghiep vu");
        }

        // 5. Tính tuổi
        int birthYear = Integer.parseInt(rawYear);
        int age = 2026 - birthYear;

        // 6. In kết quả
        System.out.println("\n===== THONG TIN NHAN VIEN =====");
        System.out.println("Ma nhan vien : " + code);
        System.out.println("Ho va ten    : " + formattedName);
        System.out.println("Tuoi         : " + age);
        System.out.println("Bo phan      : " + department);

        scanner.close();
    }

    // Hàm chuẩn hóa họ tên
    public static String capitalizeName(String name) {

        String[] words = name.trim().split("\\s+");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            result += word.substring(0, 1).toUpperCase()
                    + word.substring(1).toLowerCase();

            if (i < words.length - 1) {
                result += " ";
            }
        }

        return result;
    }
}