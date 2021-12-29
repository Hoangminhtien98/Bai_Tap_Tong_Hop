package BaiTapThem.ngay29_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Manager() {
    }

    public void display() {
        for (Student student : students) {
            System.out.println(student);
        }
    }


    public Student  create() {
        System.out.println("Nhập tên sinh của viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi sinh của viên:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính của sinh viên:");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ của sinh viên:");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình của sinh viên:");
        double avgPoint = scanner.nextDouble();
        scanner.nextLine();

        return new Student(name,age,gender,address,avgPoint);
    }
    public void add() {
        students.add(create());
    }
    public Student deleteStudent(String name) {
        boolean check = false;
        Student deleteStudent = null;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equals(name)){
                check = true;
                deleteStudent  = students.get(i);
                break;
            }
        }
        if(check){
            students.remove(deleteStudent);
            System.out.println("delete success!!");
        }else {
            System.out.println("Không có tên Sinh viên này trong danh sách");
        }
        return deleteStudent;
    }

    public Student editStudent(String name){
        Student editStudent = null;
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equals(name)){
                editStudent  = students.get(i);
                index = i;
                break;
            }
        }
        if(index!= 0){
            students.remove(index);
            System.out.println("Nhập lại thông tin sinh viên");
            Student newStudent = create();
            students.add(index, newStudent);

            System.out.println("Sửa thành công!");
        }else {
            System.out.println("Không có tên Sinh viên này trong danh sách");
        }
        return new Student();
    }
    public void displayStudentHasAvgPointMoreThan7(){
        for (Student st:students) {
            if(st.getAveragePoints() >7.5){
                System.out.println(students);
            }
        }
    }
}
