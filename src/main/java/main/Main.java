package main;

import cesde.Student;
import cesde.StudentService;

public class Main {
    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student s1 = service.buildStudentFromConsole(); //pedimos datos

        System.out.println("¡Estudiante creado!");
        System.out.println("Nombre: " + s1.getName() + " " + s1.getLastName());
        System.out.println("Curso: " + s1.getCurso().getName());

        Student student = new Student(); //objeto
        student.setId(1);
        System.out.println("id: " +student.getId());
    }
}
