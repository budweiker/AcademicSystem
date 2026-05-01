package cesde.service.portInput;

import cesde.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    // No tienen atributos
    // solo tienen metodos , que son la firma de lo que se va a implementar
    // No se pueden instaciar , solo se pueden implementar
    // Son una abstraccion total , no tienen nada de implementacion , solo la firma de los metodos

    // Contratos

    public Student createStudentService();
    public Student updateStudentService(int id);
    public Optional<Student> getStudentById(int id);
    public List<Student> getAllStudents();
        public void deleteStudent(int id);




}
