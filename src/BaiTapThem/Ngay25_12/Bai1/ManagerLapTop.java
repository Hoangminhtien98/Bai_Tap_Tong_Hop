package BaiTapThem.Ngay25_12.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerLapTop {
    private final ArrayList<LapTop> lapTops;
    Scanner scanner = new Scanner(System.in);

    public ManagerLapTop() {
        this.lapTops = new ArrayList<>();
    }

    public void displayAll() {
        for (LapTop lapTop : lapTops) {
            System.out.println(lapTop);
        }
    }

    public LapTop createLapTop() {
        System.out.println("Nhập màu: ");
        String color = scanner.nextLine();
        System.out.println("Nhập hãng: ");
        String prop = scanner.nextLine();
        System.out.println("Nhập số lượng lap: ");
        int qua = scanner.nextInt();
        System.out.println("Nhập giá tiền: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        return new LapTop(color, prop, qua, amount);
    }

    public void addLapTop(LapTop lapTop) {
        lapTops.add(lapTop);
    }

    public LapTop deleteLapTop(int id) {
        LapTop lapTop = null;
        for (LapTop l : lapTops) {
            if (l.getId() == id) {
                lapTop = l;
            }
        }
        int index = lapTops.indexOf(lapTop);
        return lapTops.remove(index);
    }

    public LapTop editLapTop(int id) {
        LapTop lapTop = null;
        for (LapTop l : lapTops) {
            if (l.getId() == id) {
                lapTop = l;
            }
        }
        if (lapTop != null) {
            int index = lapTops.indexOf(lapTop);
            System.out.println("Nhập màu mới: ");
            String color = scanner.nextLine();
            lapTop.setColor(color);
            System.out.println("Nhập hãng mới: ");
            String prop = scanner.nextLine();
            lapTop.setProperty(prop);
            System.out.println("Nhập số lượng mới: ");
            int qua = scanner.nextInt();
            lapTop.setQuantity(qua);
            System.out.println("Nhập giá tiền mới: ");
            double amount = scanner.nextDouble();
            lapTop.setAmount(amount);
            lapTops.set(index, lapTop);
        }
        return lapTop;
    }

    public void displayLapTop(String prop) {
        LapTop lapTop = null;
        for (LapTop l : lapTops) {
            if (l.getProperty().equals(prop)) {
                lapTop = l;
            }
        }
        if (lapTop != null) {
            System.out.println(lapTop);
        } else {
            System.out.println("Không có Laptop có hãng tương ứng!!");
        }
    }

    public ArrayList<LapTop> displayLapListByColor(String color) {
        ArrayList<LapTop> lapTop = new ArrayList<>();
        for (LapTop l : lapTops) {
            if (l.getColor().equals(color)) {
                lapTop.add(l);
            }
        }
        return lapTop;
    }

    public ArrayList<LapTop> searchLapByPrice(double amount) {
        ArrayList<LapTop> lapTop = new ArrayList<>();
        for (LapTop l : lapTops) {
            if (l.getAmount() == amount) {
                lapTop.add(l);
            }
        }
        return lapTop;
    }

    public ArrayList<LapTop> searchLapByType(String property) {
        ArrayList<LapTop> lapTop = new ArrayList<>();
        for (LapTop l : lapTops) {
            if (l.getProperty().equals(property)) {
                lapTop.add(l);
            }
        }
        return lapTop;

    }

    public void displayLapTopAndTotalPrice() {
        for (LapTop l : lapTops) {
            System.out.println(l.getId() + "---" + (l.getAmount() * l.getQuantity()));
        }
    }
}
