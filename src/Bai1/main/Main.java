package Bai1.main;

import Bai1.manager.HotelManager;
import Bai1.manager.HumanManager;
import Bai1.model.Human;

import java.util.Scanner;

public class Main {
    private static final HumanManager humanManager = new HumanManager();
    private static final HotelManager hotelManager = new HotelManager();
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Quản lý Human");
            System.out.println("2. Quản lý Hotel");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    menuHuman();
                    break;
                case 2:
                    menuHotel();
                    break;
            }
        } while (choice != 0);
    }

    private static void menuHuman(){
        int choice1;
        do {
            System.out.println("Menu Human");
            System.out.println("1. Tạo Human");
            System.out.println("2. Xóa Human theo id card");
            System.out.println("3. Hiển thị 1 Human theo id card");
            System.out.println("4. Hiển thị tất cả Human");
            System.out.println("0. Exit");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    System.out.println(humanManager.createHuman());
                    break;
                case 2:
                    System.out.println("Nhập vào id Card: ");
                    scanner.next();
                    String cmt = scanner.next();
                    humanManager.deleteHuman(cmt);
                    break;
                case 3:
                    System.out.println("Nhập vào id card: ");
                    scanner.next();
                    String cmt1 = scanner.next();
                    humanManager.displayHuman(cmt1);
                    break;
                case 4:
                    humanManager.displayAll();
                    break;
            }
        } while (choice1 != 0);
    }
    public static void menuHotel(){
        int choice2;
        do {
            System.out.println("Menu Hotel");
            System.out.println("1. Thuê phòng trọ");
            System.out.println("2. Trả phòng trọ");
            System.out.println("3. Hiển thị các khách trọ");
            System.out.println("4. Hiển thị các phòng trọ của khách trọ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice2 = scanner.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("Nhập vào id card của khách muốn thuê: ");
                    String cmt2 = scanner.next();
                    Human human = humanManager.getHuman(cmt2);
                    if (human != null) {
                        System.out.println(hotelManager.createHotel(human));
                    } else {
                        System.out.println("Human trên không tồn tại!!");
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào id Card: ");
                    String cmt1 = scanner.next();
                    System.out.println("Số tiền phải trả là : ");
                    System.out.println(hotelManager.payForRoom(cmt1));
                    break;
                case 3:
                    hotelManager.displayRoomTenants();
                    break;
                case 4:
                    System.out.println("Nhập vào id card : ");
                    String cmt = scanner.next();
                    hotelManager.displayRoomOfHuman(cmt);
                    break;
            }
        } while (choice2 != 0);
    }
}
