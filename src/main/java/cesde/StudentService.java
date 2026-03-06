package cesde;

import java.util.Scanner;
public class StudentService {
    private Scanner sc = new Scanner(System.in);

    // lógica
    public Student buildStudentFromConsole() {
        System.out.println("--- Registro de Nuevo Estudiante ---");

        System.out.print("Ingrese el ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        System.out.print("Ingrese el nombre: ");
        String name = sc.nextLine();

        System.out.print("Ingrese el apellido: ");
        String lastName = sc.nextLine();

        System.out.print("Ingrese el email: ");
        String email = sc.nextLine();

        // Lógica para el curso
        System.out.print("Ingrese ID del curso: ");
        int cId = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre del curso: ");
        String cName = sc.nextLine();
        Course curso = new Course(cId, cName);

        System.out.print("¿Está activo? (true/false): ");
        boolean status = sc.nextBoolean();

        // retornamos objeto
        return new Student(id, name, lastName, email, curso, status);
    }
}
