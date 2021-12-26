package BaiTapThem.Ngay25_12.Bai2.manager;

import BaiTapThem.Ngay25_12.Bai2.model.Apple;
import BaiTapThem.Ngay25_12.Bai2.model.Banana;
import BaiTapThem.Ngay25_12.Bai2.model.Fruit;
import BaiTapThem.Ngay25_12.Bai2.model.Lemon;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerFruit {
    ArrayList<Fruit> fruits;
    Scanner scanner = new Scanner(System.in);

    public ManagerFruit() {
        this.fruits = new ArrayList<>();
    }

    public void displayAllFruit() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public void addFruit() {
        fruits.add(createFruit());
    }

    public Fruit createFruit() {
        System.out.println("1. Banana");
        System.out.println("2. Lemon");
        System.out.println("3. Apple");
        int choice = scanner.nextInt();
        double weight;
        String taste;
        String color;
        double price;
        Fruit fruitSample = null;
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Nhập cân nặng: ");
                weight = scanner.nextDouble();
                System.out.println("Nhập vị : ");
                taste = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Nhập màu: ");
                color = scanner.nextLine();
                System.out.println("Nhập giá tiền: ");
                price = scanner.nextDouble();
                scanner.nextLine();
                fruitSample = new Banana(weight, taste, color, price);
                break;
            case 2:
                System.out.println("Nhập cân nặng: ");
                weight = scanner.nextDouble();
                System.out.println("Nhập vị : ");
                taste = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Nhập màu: ");
                color = scanner.nextLine();
                System.out.println("Nhập giá tiền: ");
                price = scanner.nextDouble();
                scanner.nextLine();
                fruitSample = new Lemon(weight, taste, color, price);
                break;
            case 3:
                System.out.println("Nhập cân nặng: ");
                weight = scanner.nextDouble();
                System.out.println("Nhập vị : ");
                taste = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Nhập màu: ");
                color = scanner.nextLine();
                System.out.println("Nhập giá tiền: ");
                price = scanner.nextDouble();
                scanner.nextLine();
                fruitSample = new Apple(weight, taste, color, price);
                break;
        }
        return fruitSample;
    }

    public ArrayList<Fruit> searchFruitByPrice() {
        ArrayList<Fruit> fruit = new ArrayList<>();
        double max = fruits.get(0).getPrice();
        for (Fruit f : fruits) {
            if (f.getPrice() > max) {
                max = f.getPrice();
            }
        }
        for (Fruit f : fruits) {
            if (f.getPrice() == max) {
                fruit.add(f);
            }
        }
        return fruit;
    }
    public ArrayList<Fruit> displayFruitByPrice() {
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        for (Fruit f : fruits) {
            if (f.getPrice() <= 100000) {
                fruitArrayList.add(f);
            }
        }
        return fruitArrayList;
    }

    public ArrayList<Apple> displayAllApple () {
        ArrayList<Apple> apples = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                apples.add((Apple) fruit);
            }
        }
        return apples;
    }
    public ArrayList<Banana> displayAllBanana () {
        ArrayList<Banana> bananas  = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit instanceof Banana) {
                bananas.add((Banana) fruit);
            }
        }
        return bananas;
    }
    public ArrayList<Lemon> displayAllLemon () {
        ArrayList<Lemon> lemons = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit instanceof Lemon) {
                lemons.add((Lemon) fruit);
            }
        }
        return lemons;
    }
    public Fruit updateFruitByName(String name) {
        Fruit fruit = null;
        for (Fruit f : fruits) {
            if (f.getName().equals(name)) {
                fruit = f;
            }
        }
        if (fruit != null) {
            int index = fruits.indexOf(fruit);
            System.out.println("Nhập cân nặng mới : ");
            double wei = scanner.nextDouble();
            fruit.setWeight(wei);
            System.out.println("Nhập vị mới: ");
            scanner.nextLine();
            String taste = scanner.nextLine();
            fruit.setTaste(taste);
            System.out.println("Nhập màu sắc mới: ");
            String color = scanner.nextLine();
            fruit.setColor(color);
            System.out.println("Nhập giá mới: ");
            double price = scanner.nextDouble();
            fruit.setPrice(price);
            scanner.nextLine();
            fruits.set(index, fruit);
        }
        return fruit;
    }
    public Fruit deletedFruit(String name) {
        Fruit fruit = null;
        for (Fruit f : fruits) {
            if (f.getName().equals(name)) {
                fruit = f;
            }
        }
        int index = fruits.indexOf(fruit);
        return fruits.remove(index);
    }

}
