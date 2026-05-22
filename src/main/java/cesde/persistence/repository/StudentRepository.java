package cesde.persistence.repository;

import cesde.domain.Student;
import cesde.service.portoutput.StudentPersistencePort;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements StudentPersistencePort {

    List<Student> students = new ArrayList<>();

    public Student createStudentRepository(Student student){

        students.add(student);

        for (Student student1: students) {
            System.out.println(student1.getId() + " " + student1.getName() + " " + student1.getLastName());
        }


        return student;

    }


    public Student getStudentById(int id){

        for (Student student: students) {
            if(student.getId() == id){

                return student;
            }
        }

        return null;
    }

    public List<Student> getAllStudents(){

        for(Student student: students){
            System.out.println(student.getId() + " " + student.getName() + " " + student.getLastName());
        }
        return students;
    }

    public Student updateStudentRepository(int id){

        for (Student student: students) {
            if(student.getId() == id){
                return student;
            }
        }

        return null;
    }


    public void deleteStudentRepository(int id){

        for (Student student: students) {
            if(student.getId() == id){
                students.remove(student);
                System.out.println("Estudiante eliminado");
            }
        }

        System.out.println("Estudiante no encontrado");
    }






}
