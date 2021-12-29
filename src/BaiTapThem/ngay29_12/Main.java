package BaiTapThem.ngay29_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa 1 sinh viên theo tên");
            System.out.println("3. Sửa 1 sinh viên theo tên");
            System.out.println("4. Hiển thị tất cả sinh viên");
            System.out.println("5. Hiển thị tất cả sinh viên có điểm trung bình trên 7,5");
            System.out.println("6. Hiển thị tất cả sinh viên theo cú pháp");
            System.out.println("7. Đọc ghi list ra file CSV");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.display();
                    break;
                case 2:
                    manager.deleteStudent()
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        }
    }
}
