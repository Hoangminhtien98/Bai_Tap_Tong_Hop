package BaiTapThem.Ngay25_12.Bai2.main;

import BaiTapThem.Ngay25_12.Bai1.LapTop;
import BaiTapThem.Ngay25_12.Bai2.manager.ManagerFruit;
import BaiTapThem.Ngay25_12.Bai2.model.Apple;
import BaiTapThem.Ngay25_12.Bai2.model.Banana;
import BaiTapThem.Ngay25_12.Bai2.model.Fruit;
import BaiTapThem.Ngay25_12.Bai2.model.Lemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerFruit managerFruit = new ManagerFruit();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm 1 quả vào list");
            System.out.println("2. Hiển thị tất cả các loại quả");
            System.out.println("3. Hiển thị quả Táo");
            System.out.println("4. Hiển thị quả Chuối");
            System.out.println("5. Hiển thị quả chanh");
            System.out.println("6. Hiển thị quả có đơn giá cao nhất");
            System.out.println("7. Hiển thị quả có thể mua nhiều bằng 100000");
            System.out.println("8. Thêm quả vao list theo tên ");
            System.out.println("9. Xóa quả theo tên");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerFruit.addFruit();
                    break;
                case 2:
                    managerFruit.displayAllFruit();
                    break;
                case 3:
                    ArrayList<Apple> apples = managerFruit.displayAllApple();
                    for (Apple apple : apples) {
                        if (apple != null) {
                            System.out.println("Tất cả quả táo là");
                            System.out.println(apple);
                        } else {
                            System.out.println("Không có quả táo nào trong danh sách!!");
                        }
                    }
                    break;
                case 4:
                   ArrayList<Banana> bananas = managerFruit.displayAllBanana();
                   for (Banana banana : bananas) {
                       if (banana != null) {
                           System.out.println("Tất cả quả chuối là: ");
                           System.out.println(banana);
                       } else {
                           System.out.println("Không có quả chuối nào trong danh sách!!");
                       }
                   }
                case 5:
                    ArrayList<Lemon> lemons = managerFruit.displayAllLemon();
                    for (Lemon lemon : lemons) {
                        if (lemon != null) {
                            System.out.println("Tất cả quả chanh là: ");
                            System.out.println(lemon);
                        } else {
                            System.out.println("Không có quả chanh nào có trong danh sách!!");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Quả có đơn giá cao nhất là: ");
                    ArrayList<Fruit> arrayList = managerFruit.searchFruitByPrice();
                    System.out.println(arrayList);
                    break;
                case 7:
                    System.out.println("Quả có thể mua đc nhiểu nhất bằng 100000 là");
                    scanner.nextLine();
                    ArrayList<Fruit> arrayList1 = managerFruit.displayFruitByPrice();
                    System.out.println(arrayList1);
                    break;
                case 8:
                    System.out.println("Nhập Tên Quả ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    managerFruit.updateFruitByName(name);
                case 9:
                    System.out.println("Input name: ");
                    String nameDelete = String.valueOf(scanner.nextInt());
                    scanner.nextLine();
                    Fruit fruit = managerFruit.deletedFruit(nameDelete);
                    if (fruit == null){
                        System.out.println("Không có quả có tên tương ứng");
                    } else {
                        System.out.println();
                    }
                    break;
            }
        } while (choice != 0);
    }
}
