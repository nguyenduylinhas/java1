package Lab8;

import java.util.Scanner;

import static Lab8.Main.students;

public class Student {
    static int count = 0;
    private static int studentId = 0;
    private static String fullName;
    private static String address;
    private static int phoneNumber;
    private static String dateOfBirth;
    private static String dateOfEnrollment;
    private static int age;
    private static int academicYear;

    public Student(int studentId, String fullName, String address, int phoneNumber, String dateOfBirth, String dateOfEnrollment) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEnrollment = dateOfEnrollment;
        this.age = calculateAge();
        this.academicYear = calculateAcademicYear();
    }

    public Student() {

    }

    public Student(int studentId, String fullName, String address, int phoneNumber) {
    }


    public static int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public int calculateAge() {
        return 0;
    }

    public int calculateAcademicYear() {
        return 0;
    }
    public static void input(){
       Scanner sc = new Scanner(System.in);
       System.out.println("nhap ten sinh vien :");
       fullName = sc.nextLine();
       System.out.println("nhap dia chi :");
       address = sc.nextLine();
       System.out.println("nhap so dien thoai :");
       phoneNumber = Integer.parseInt(sc.nextLine());
       System.out.println("Ngay sinh :");
       dateOfBirth = sc.nextLine();
       System.out.println("ngay nhap hoc :");
       dateOfEnrollment = sc.nextLine();
       System.out.println("tuoi hoc sinh :");
       age = Integer.parseInt(sc.nextLine());
       System.out.println("sinh vien nam thu :");
       academicYear = Integer.parseInt(sc.nextLine());
   }

    public void display(){
       System.out.println(this);
   }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfEnrollment='" + dateOfEnrollment + '\'' +
                ", age=" + age +
                ", academicYear=" + academicYear +
                '}';
    }

}

