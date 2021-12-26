package BaiTapThem.Ngay25_12.Bai2.model;

public class Lemon extends Fruit {

    public Lemon(double weight, String taste, String color, double price) {
    }

    public Lemon(String name, double weight, String taste, String color, double price) {
        super(name, weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Lemon{" + super.toString() + '}';
    }
}
