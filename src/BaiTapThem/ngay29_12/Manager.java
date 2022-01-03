package BaiTapThem.ngay29_12;



import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Manager {
    public static final String PATH_NAME = "src/BaiTapThem/ngay29_12/students.csv";
    private final ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.students = readFile(PATH_NAME);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public boolean checkAgeAndAverage(int age, double average) {
        return (age >= 18 && age <= 60 && !(average < 0) && !(average > 10));
    }
    public String getGenderByChoice(int choice) {
        String gender = "";
        switch (choice) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            case 3:
                gender = "Other";
                break;
        }
        return gender;
    }

    public void addStudent() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");
        System.out.println("Nhập lựa chọn của bạn: ");
        int gender = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        double average = scanner.nextDouble();
        scanner.nextLine();
        if (checkAgeAndAverage(age, average) && !getGenderByChoice(gender).equals("")){
            students.add(new Student(name, age, getGenderByChoice(gender), address, average));
            writeFile(students, PATH_NAME);
            System.out.println("Add student have name = " + name + " successfully!");
        } else {
            System.out.println("Data entry error, please check again!!!");
        }
    }
    public Student editStudent(String name) {
        Student editStudent = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                editStudent = student;
            }
        }
        if (editStudent != null) {
            int index = students.indexOf(editStudent);
            System.out.println("Nhập tên mới: ");
            editStudent.setName(scanner.nextLine());
            System.out.println("Nhập tuổi mới: ");
            editStudent.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhập giới tính mới: ");
            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.println("3. Other");
            System.out.println("Nhập lựa chọn của bạn :");
            int gender = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập địa chỉ mới: ");
            editStudent.setAddress(scanner.nextLine());
            System.out.println("Nhập điểm trung bình mới: ");
            editStudent.setAveragePoints(scanner.nextDouble());
            scanner.nextLine();
            if (checkAgeAndAverage(editStudent.getAge(), editStudent.getAveragePoints()) && !getGenderByChoice(gender).equals("")){
                editStudent.setGender(getGenderByChoice(gender));
                students.set(index, editStudent);
                writeFile(students, PATH_NAME);
                System.out.println("Update student have name = " + name + " successfully!");
            } else {
                System.out.println("Date entry error, please check again!!!");
            }
        }
        return editStudent;
    }
    public Student deleteStudent(String name){
        Student editStudent = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                editStudent = student;
            }
        }
        if (editStudent != null) {
            students.remove(editStudent);
            writeFile(students, PATH_NAME);
            System.out.println("Delete student have name = " + name + " successfully!");
        }
        return editStudent;
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("List student is Empty!");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void displayStudentByAverage() {
        if (students.isEmpty()) {
            System.out.println("List student is Empty!");
            return;
        }
        for (Student student : students) {
            if (student.getAveragePoints() > 7.5) {
                System.out.println(student);
            }
        }
    }

    public void displayStudentFormat() {
        if (students.isEmpty()) {
            System.out.println("List student is Empty!!");
            return;
        }
        for (Student student : students){
            if (student.getAveragePoints() > 8.0) {
                System.out.println(student.getName() + " - " + student.getAveragePoints() + " - " + "Good");
            } else if (student.getAveragePoints() > 6.0) {
                System.out.println(student.getName() + " - " + student.getAveragePoints() + " - " + "Pretty");
            } else if (student.getAveragePoints() > 4.0) {
                System.out.println(student.getName() + " - " + student.getAveragePoints() + " - " + "Normal");
            } else {
                System.out.println(student.getName() + " - " + student.getAveragePoints() + " - " + "Weak");
            }
        }
    }
    public void writeFile(ArrayList<Student> students, String path){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getName() + "," + student.getAge() + "," + student.getGender() + "," + student.getAddress() + "," + student.getAveragePoints() +"\n");
            }
            bufferedWriter.close();
            System.out.println("Write file successfully!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public ArrayList<Student> readFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] strings = line.split(", ");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), strings[2], strings[3], Double.parseDouble(strings[4])));

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }
}
