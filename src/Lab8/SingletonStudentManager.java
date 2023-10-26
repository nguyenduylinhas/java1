package Lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SingletonStudentManager {
    private static SingletonStudentManager instance = null;
    private List<Student> students;

    private SingletonStudentManager() {
        students = new ArrayList<>();
    }

    public static SingletonStudentManager getInstance() {
        if(instance == null) {
            instance = new SingletonStudentManager();
        }
        return instance;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

}

