package cesde.service.portoutput;

import cesde.domain.Student;

import java.util.List;

public interface StudentPersistencePort {


    Student createStudentRepository(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
    Student updateStudentRepository(int id);
    void deleteStudentRepository(int id);
}
