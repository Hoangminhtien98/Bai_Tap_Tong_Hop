package BaiTapThem.ngay29_12;

public class Student extends Human {
    private double averagePoints;


    public Student(String name, int age, String gender, String address, double averagePoints) {
        super(name, age, gender, address);
        this.averagePoints = averagePoints;
    }

    public double getAveragePoints() {
        return averagePoints;
    }

    public void setAveragePoints(double averagePoints) {
        this.averagePoints = averagePoints;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "averagePoints=" + averagePoints +
                '}';
    }
}
