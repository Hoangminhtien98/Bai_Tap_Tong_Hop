package BaiTapThem.Ngay25_12.Bai2.model;

public class Banana extends Fruit {
    public Banana(double weight, String taste, String color, double price) {
    }

    public Banana(String name, double weight, String taste, String color, double price) {
        super(name, weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Banana{" + super.toString() + '}';
    }
}
