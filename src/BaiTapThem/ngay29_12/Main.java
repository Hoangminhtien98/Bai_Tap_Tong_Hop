package BaiTapThem.ngay29_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm Sinh viên");
            System.out.println("2. Cập nhật sinh viên bằng tên ");
            System.out.println("3. Xóa sinh viên qua tên ");
            System.out.println("4. Hiện tất cả sinh viên");
            System.out.println("5. Hiển thị tất cả số sinh viên có điểm trung bình lớn hơn hoặc bằng 7.5");
            System.out.println("6. Hiển thị sinh viên ở định dạng");
            System.out.println("7. Ghi file");
            System.out.println("8. Đọc file");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    System.out.println("Nhập tên cần sửa: ");
                    scanner.nextLine();
                    String editName = scanner.nextLine();
                    System.out.println(manager.editStudent(editName));
                    break;
                case 3:
                    System.out.println("Nhập tên sinh viên cần xóa: ");
                    scanner.nextLine();
                    String deleteName = scanner.nextLine();
                    System.out.println(manager.deleteStudent(deleteName));
                    break;
                case 4:
                    System.out.println("Tất cả sinh viên: ");
                    manager.displayAll();
                    break;
                case 5:
                    System.out.println("Tất cả sinh viên theo mức điểm trung bình: ");
                    manager.displayStudentByAverage();
                    break;
                case 6:
                    System.out.println("All students in format: ");
                    manager.displayStudentFormat();
                    break;
                case 7:
                    manager.writeFile(manager.getStudents(), Manager.PATH_NAME);
                    break;
                case 8:
                    ArrayList<Student> students = manager.readFile(Manager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
            }
        } while (choice != 0);
    }
}
