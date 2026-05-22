package cesde.domain;

import java.util.List;
import java.util.Scanner;

public class Student extends User {


    // POJO - Plain Old Java Object

    // Atributes


    private String studentType;

    //Constructores

    public Student(){
        super();
    }

    public Student(int id, String name, String lastName, String email, String phone, String password, String status, String studentType) {
        super(id, name, lastName, email, phone, password, status);
        this.studentType = studentType;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }
}
