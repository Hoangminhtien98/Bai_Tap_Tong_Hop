package BaiTapThem.Ngay25_12.Bai1;

public class LapTop {
    private static int VALUE = 0;
    private int id;
    private String color;
    private String property;
    private int quantity;
    private double amount;

    public LapTop () {
    }

    public LapTop(String color, String property, int quantity, double amount) {
        this.id = ++VALUE;
        this.color = color;
        this.property = property;
        this.quantity = quantity;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", property='" + property + '\'' +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }
}
