package Lab8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.*;

public class Main {
    static List<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
           int choose;
           do {
               showMenu();
               choose = Integer.parseInt(sc.nextLine());
               switch (choose){
                   case 1:
                       addStudent();
                       break;
                   case 2:
                        displayStudent();
                       break;
                   case 3:
                       editStudent();
                       break;
                   case 4:
                         deleteStudent();
                       break;
                   case 5:
                         StatisticsStudent();
                       break;
                   case 6:
                       saveFileStudent();
                       break;
                   case 7:
                       System.out.println("exit !!!");
                       break;
                   default:
                       System.out.println("nhap sai vui long nhap lai");
                       break;
               }
           }while (choose != 6);

        }
    public static void showMenu() {
        System.out.println("1. AddStudent :");
        System.out.println("2. showStudent :");
        System.out.println("3. EditStudent :");
        System.out.println("4. DeleteStudent :");
        System.out.println("5. StatisticsStudent :");
        System.out.println("6. SaveFileStudent :");
        System.out.println("7. Exit");
    }
    private static void saveFileStudent() {
        try {
            FileWriter fileWriter = new FileWriter("student.txt");
            for (Student student : students) {
                fileWriter.write(student.getStudentId() + "," + student.getFullName() + "," + student.getAddress() + "," + student.getPhoneNumber() + ","
                + student.getDateOfBirth() + "," + student.getDateOfEnrollment()+"," + student.getAge() +","+student.getAcademicYear()+"\n" );
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void StatisticsStudent() {
        System.out.print("Nhập năm: ");
        int namSinh = sc.nextInt();
        sc.nextLine();

        System.out.println("Danh sách sinh viên sinh năm " + namSinh + ":");
        for (Student student : students) {
            if (student.getStudentId() / 10000 == namSinh) {
                System.out.println(student.getFullName());
            }
        }
    }

    private static void deleteStudent() {

        System.out.println("delete student :");
        int id = Integer.parseInt(sc.nextLine());
        for (Student student:students) {
            if (Student.getStudentId() == id){
                students.remove(student);
                break;
            }
        }
    }

    private static void editStudent() {
        System.out.println("edit student :");
        int id = Integer.parseInt(sc.nextLine());
        for (Student student:students) {
            if (Student.getStudentId() == id){
                Student.input();
                break;
            }
        }
    }
    private static void displayStudent() {
        for (Student student : students) {
            student.display();
        }
    }
    private static void addStudent() {
        System.out.println("nhap so sinh vien :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Student std = new Student();
            std.input();
            students.add(std);
        }
    }
    }
