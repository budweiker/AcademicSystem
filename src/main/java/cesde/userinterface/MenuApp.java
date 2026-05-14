package cesde.userinterface;

import cesde.domain.Student;
import cesde.persistence.db.DataBaseConnection;
import cesde.util.TypeValidator;
import cesde.view.StudentView;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    private final StudentView studentView;

    public MenuApp(StudentView studentView){
        this.studentView = studentView;
    }


   public void mainMenu(){

       System.out.println("Presione 1 para iniciar la Aplicación");

       int init = sc.nextInt();

       sc.nextLine();

       while(init != 0){

           DataBaseConnection.getInstance().getConnection();

           System.out.println("Seleccione una opción 1. Registro 2. Inicio de Sesion 3. Salir ");

           int option = sc.nextInt();

           sc.nextLine();

           switch (option){

               case 1:
                   System.out.println("Crear usuario");
                   studentView.createStudent();
                   break;
               case 2:
                   System.out.println("Iniciar Sesión");
                   boolean token= true;
                   menuApplication(token);
                   break;
               case 3:
                   System.out.println("Salir del sistema ");
                   init = 0;
               default:
                   System.out.println("Ingrese una opción valida");
           }
       }

   }


   public void menuApplication(boolean token){

        while(token) {
            System.out.println("Seleccione 1. Estudiante 2. Gestion de Cursos");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Estudiante");
                    studentMenu();
                    break;
                case 2:
                    System.out.println("Gestion de Cursos");
                    courseMenu();
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal");
                    token = false;
                    break;
                default:
                    System.out.println("Seleccione menu valido");
            }

        }

   }


   public void courseMenu(){

       System.out.println("Menu Curso");
       boolean init = true;
       sc.nextLine();

       while(init){
           System.out.println("1. Crear Curso 2. Actualizar curso 3. ver Cursos 4. Ver curso por Id 5. Eliminar Curso 6. Volver");

           int opt = sc.nextInt();
           sc.nextLine();
           switch (opt){
               case 1:
                   System.out.println("Crear Curso");
                   break;
               case 6:
                   init = false;
                   break;
               default:
                   System.out.println("Seleccione opción valida");
           }
       }
   }



    public void studentMenu(){

        System.out.println("Menu Estudiate");
        boolean init = true;
        sc.nextLine();

        while(init){
            System.out.println("1. Crear Estudiante 2. Actualizar Estudiante 3. ver Estudiantes 4. VerEstudiante por Id 5. Eliminar Estudiante 6. Volver");

            int opt = sc.nextInt();
            sc.nextLine();
            switch (opt){
                case 1:
                    System.out.println("Crear Estudiante");
                    studentView.createStudent();
                    break;
                case 2:
                    System.out.println("Actualizar Estudiante");
                    studentView.updateStudent(TypeValidator.validateInt("Ingrese el id del estudiante a actualizar"));
                    break;
                case 3:
                    System.out.println("Ver Estudiantes");
                    studentView.getAllStudents();
                    break;
                case 4:
                    System.out.println("Ver estudiante por id");
                    System.out.println("Ingrese el id del estudiante");
                    int id = sc.nextInt();
                    studentView.getStudentById(id);
                    break;
                case 5:
                    System.out.println("Eliminar Estudiante");
                    System.out.println("Ingrese el id del estudiante");
                    int idToRemove = sc.nextInt();
                    studentView.deleteStudent(idToRemove);
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal");
                    init = false;
                    break;
                default:
                    System.out.println("Seleccione opción valida");
            }
        }
    }


}
