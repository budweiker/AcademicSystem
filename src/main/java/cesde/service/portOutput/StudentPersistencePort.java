package cesde.service.portOutput;

import cesde.domain.Student;

import java.util.List;

public interface StudentPersistencePort {

    public Student createStudentRepository(Student student);
    public Student getStudentById(int id);
    public List<Student> getAllStudents();
    public Student updateStudentRepository(int id);
    public void deleteStudentRepository(int id);
}
