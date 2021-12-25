package BaiTapThem.Ngay22_12;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    ArrayList<Human> humans;
    Scanner scanner = new Scanner(System.in);
    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    public void displayAll(){
        for (Human human : humans){
            System.out.println(human);
        }
    }

    public Human createHuman(){
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        return new Human(name, age, gender, address);
    }

    public void addHuman(Human human) {
        humans.add(human);
    }

    public ArrayList<Human> displayHumanByGender(String gender) {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans){
            if (h.getGender().equals(gender)){
                human.add(h);
            }
        }
        return human;
    }

    public ArrayList<Human> displayByAgeUnder20(){
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans) {
            if (h.getAge() < 20) {
                human.add(h);
            }
        }
        return human;
    }

    public Human deleteHumanByName(String name){
        Human human = new Human();
        for (Human h : humans){
            if (h.getName().equals(name)){
                human = h;
                break;
            }
        }
        humans.remove(human);
        return human;
    }
    public ArrayList<Human> displayHumanByName(String name) {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans){
            if (h.getGender().equals(name)){
                human.add(h);
            }
        }
        return human;
    }

    public Human editHuman(String name){
        Human human = null;
        for (Human h : humans) {
            if (h.getName().equals(name)){
                human = h;
                break;
            }
        }
        if (human != null){
            int index = humans.indexOf(human);
            System.out.println("Nhập tên: ");
            String name1 = scanner.nextLine();
            human.setName(name1);
            System.out.println("Nhập tuổi: ");
            int age = scanner.nextInt();
            human.setAge(age);
            System.out.println("Nhập giới tính : ");
            String gender = scanner.nextLine();
            human.setGender(gender);
            scanner.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String address = scanner.nextLine();
            human.setAddress(address);
            humans.set(index, human);
        }
        return human;
    }

}
