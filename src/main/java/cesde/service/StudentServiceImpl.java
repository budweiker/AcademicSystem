package cesde.service;

import cesde.domain.Student;
import cesde.persistence.repository.StudentRepository;
import cesde.service.portInput.StudentService;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl( StudentRepository studentRepository){

        this.studentRepository= studentRepository;// Esto es una inyeccion de dependencias
    }

    @Override
    public Student createStudentService(){

        Student student = new Student();

        student.setId(TypeValidator.validateInt("Ingrese el id del estudiante"));
        student.setName(TypeValidator.validateString("Ingrese el Nombre del Estudiante"));
        student.setLastName(TypeValidator.validateString("Ingrese el apellido del estudiante"));
        student.setEmail(TypeValidator.validateString("Ingrese un email valido"));
        student.setStatus(TypeValidator.validateBoolean("Seleccione un estado"));

        return studentRepository.createStudentRepository(student);
    }

    @Override
    public Student updateStudentService(int id){

        Student student = studentRepository.getStudentById(id);

        if(id == student.getId()){
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Apellido \n" +
                    "4. Email \n" +
                    "5. Estado ");

            int option = TypeValidator.validateInt("Opcion: ");

            switch (option){
                case 1:
                    student.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    student.setName(TypeValidator.validateString("Actualizar Nombre"));
                    break;
                case 3:
                    student.setLastName(TypeValidator.validateString("Actualizar Apellido"));
                    break;
                case 4:
                    student.setEmail(TypeValidator.validateString("Actualizar Email"));
                    break;
                case 5:
                    student.setStatus(TypeValidator.validateBoolean("Actualizar Estado"));
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }

        }

        return student;
    }

    @Override
    public Optional<Student> getStudentById(int id) {

        Student student = studentRepository.getStudentById(id);

        if (id == student.getId()) {
            System.out.println("id:" + student.getId() + "\n" +
                    "Nombre:" + student.getName() + "\n" +
                    "Apellido " + student.getLastName() + "\n" +
                    "email: " + student.getEmail() + "\n" +
                    "Status: " + student.isStatus());
        } else {
            System.out.println("Id no encontrado");
        }

        return Optional.ofNullable(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @Override
    public void deleteStudent(int id) {
        System.out.println("Estoy en el service");
        studentRepository.deleteStudentRepository(id);
    }

}
