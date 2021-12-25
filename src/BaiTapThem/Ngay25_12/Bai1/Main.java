package BaiTapThem.Ngay25_12.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerLapTop managerLapTop = new ManagerLapTop();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xóa sản phẩm theo ID");
            System.out.println("4. Hiển thị tất cả sản phẩm");
            System.out.println("5. Hiển thị tất cả sản phẩm của 1 hãng");
            System.out.println("6. Tìm sản phẩm theo khoảng giá");
            System.out.println("7. Tìm sản phẩm thêm hãng");
            System.out.println("8. Tìm sản phẩm theo màu sắc");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    LapTop lapTop = managerLapTop.createLapTop();
                    managerLapTop.addLapTop(lapTop);
                    break;
                case 2:
                    System.out.println("Input ID: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(managerLapTop.editLapTop(idEdit));
                    break;
                case 3:
                    System.out.println("Input Id: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    LapTop lapTop1 = managerLapTop.deleteLapTop(idDelete);
                    if (lapTop1 == null){
                        System.out.println("Không có Laptop có id tương ứng");
                    } else {
                        System.out.println();
                    }
                    break;
                case 4:
                    managerLapTop.displayAll();
                    break;
                case 5:
                    System.out.println("Input Property: ");
                    String property = scanner.nextLine();
                    managerLapTop.displayLapTop(property);
                    break;
                case 6:
                    System.out.println("Nhập giá tiền sp muốn tìm: ");
                    scanner.nextLine();
                    double amount = scanner.nextDouble();
                    ArrayList<LapTop> arrayList1 = managerLapTop.searchLapByPrice(amount);
                    System.out.println(arrayList1);
                    break;
                case 7:
                    System.out.println("Nhập hãng muốn tìm: ");
                    scanner.nextLine();
                    String prop = scanner.nextLine();
                    ArrayList<LapTop> arrayList2 = managerLapTop.searchLapByType(prop);
                    System.out.println(arrayList2);
                    break;
                case 8:
                    System.out.println("Nhập màu muốn tìm: ");
                    scanner.nextLine();
                    String color = scanner.nextLine();
                    ArrayList<LapTop> arrayList = managerLapTop.displayLapListByColor(color);
                    System.out.println(arrayList);
                    break;
                case 9:
                    managerLapTop.displayLapTopAndTotalPrice();
                    break;
            }
        } while (choice != 0);
    }
}
