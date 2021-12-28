package BaiTapThem.Ngay25_12.Bai2.main;

import BaiTapThem.Ngay25_12.Bai1.LapTop;
import BaiTapThem.Ngay25_12.Bai2.manager.ManagerFruit;
import BaiTapThem.Ngay25_12.Bai2.model.Apple;
import BaiTapThem.Ngay25_12.Bai2.model.Banana;
import BaiTapThem.Ngay25_12.Bai2.model.Fruit;
import BaiTapThem.Ngay25_12.Bai2.model.Lemon;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerFruit managerFruit = new ManagerFruit();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----Menu----");
            System.out.println("1. Hiển thị tất cả các loại quả");
            System.out.println("2. Hiển thị tất cả quả táo");
            System.out.println("3. Hiển thị tất cả quả chuối");
            System.out.println("4. Hiển thị tất cả quả chanh");
            System.out.println("5. Hiển thị quả có giá cao nhất");
            System.out.println("6. Với 100000 bạn có thể mua được nhiều nhất");
            System.out.println("7. Thêm quả");
            System.out.println("8. Xóa quả theo giá");
            System.out.println("9. Ghi vào file CSV");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    managerFruit.displayAll();
                    break;
                case 2:
                    managerFruit.displayApple();
                    break;
                case 3:
                    managerFruit.displayBanana();
                    break;
                case 4:
                    managerFruit.displayLemon();
                    break;
                case 5:
                    managerFruit.displayByMaxPrice();
                    break;
                case 6:
                    managerFruit.displayByMinPrice();
                    break;
                case 7:
                    menu(scanner, managerFruit);
                    break;
                case 8:
                    System.out.println("Nhập giá muốn xóa: ");
                    double price = scanner.nextDouble();
                    ArrayList<Fruit> fruitDelete = managerFruit.deleteByPrice(price);
                    break;
                case 9:
                    managerFruit.exportCsv();
                    break;

            }
        } while (choice != 0);
    }
    public static void menu(Scanner scanner, ManagerFruit managerFruit) {
        int choice1;
        do {
            System.out.println("---Menu---");
            System.out.println("1. Thêm quả táo");
            System.out.println("2. Thêm quả chuối");
            System.out.println("3. Thêm quả chanh");
            System.out.println("0. Quay lại menu");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice1 = scanner.nextInt();

            switch (choice1) {
                case 1:
                    Apple apple = (Apple) managerFruit.createFruit(choice1);
                    managerFruit.addFruit(apple);
                    break;
                case 2:
                    Banana banana = (Banana) managerFruit.createFruit(choice1);
                    managerFruit.addFruit(banana);
                    break;
                case 3:
                    Lemon lemon = (Lemon) managerFruit.createFruit(choice1);
                    managerFruit.addFruit(lemon);
                    break;
            }
        } while (choice1 != 0);
    }
}
