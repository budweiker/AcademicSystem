package cesde.service;

import cesde.domain.Student;
import cesde.persistence.repository.StudentRepository;
import cesde.service.portinput.StudentService;
import cesde.service.portoutput.StudentPersistencePort;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {

    private final StudentPersistencePort studentPersistencePort;

    public StudentServiceImpl(StudentPersistencePort studentPersistencePort) {
        this.studentPersistencePort = studentPersistencePort;
    }

    @Override
    public Student createStudentService(){

        Student student = new Student();

        student.setId(TypeValidator.validateInt("Ingrese el id del estudiante"));
        student.setName(TypeValidator.validateString("Ingrese el Nombre del Estudiante"));
        student.setLastName(TypeValidator.validateString("Ingrese el apellido del estudiante"));
        student.setPhone(TypeValidator.validateString("Ingrese un numero de telefono valido"));
        student.setEmail(TypeValidator.validateString("Ingrese un email valido"));
        student.setPassword(TypeValidator.validateString("Ingrese una contraseña valida"));
        student.setStatus(TypeValidator.validateString("Seleccione un estado"));
        student.setStudentType(TypeValidator.validateString("Seleccione un tipo de estudiante"));


        return studentPersistencePort.createStudentRepository(student);
    }

    @Override
    public Student updateStudentService(int id){

        Student student = studentPersistencePort.getStudentById(id);

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
                    student.setStatus(TypeValidator.validateString("Actualizar Estado"));
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }

        }

        return student;
    }

    @Override
    public Optional<Student> getStudentById(int id) {

        Student student = studentPersistencePort.getStudentById(id);

        if (id == student.getId()) {
            System.out.println("id:" + student.getId() + "\n" +
                    "Nombre:" + student.getName() + "\n" +
                    "Apellido " + student.getLastName() + "\n" +
                    "email: " + student.getEmail() + "\n" +
                    "Status: " + student.getStatus());
        } else {
            System.out.println("Id no encontrado");
        }

        return Optional.ofNullable(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentPersistencePort.getAllStudents();
    }

    @Override
    public void deleteStudent(int id) {
        System.out.println("Estoy en el service");
        studentPersistencePort.deleteStudentRepository(id);
    }

}
