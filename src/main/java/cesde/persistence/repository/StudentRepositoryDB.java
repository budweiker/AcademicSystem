package cesde.persistence.repository;

import cesde.domain.Student;
import cesde.persistence.mapper.StudentRowMapper;
import cesde.service.portOutput.StudentPersistencePort;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentRepositoryDB implements StudentPersistencePort {

    private final Connection connection;
    private final StudentRowMapper rowMapper;

    public StudentRepositoryDB(Connection connection, StudentRowMapper rowMapper) {
        this.connection = connection;
        this.rowMapper = rowMapper;
    }

    @Override
    public Student createStudentRepository(Student student) {

        String sql = "INSERT INTO student (id, name, last_name, email, phone, password, status, student_type) VALUES (?,?,?,?,?,?,?,?)";

        try(PreparedStatement ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){

            setCustompARAMS(ps, student);
            ps.executeUpdate();

            ResultSet keys = ps.getGeneratedKeys();
        }
    }


    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student updateStudentRepository(int id) {
        return null;
    }

    @Override
    public void deleteStudentRepository(int id) {

    }

    //Helpers
    private void setCustompARAMS(PreparedStatement ps, Student student) throws SQLException{
        ps.setInt(1,student.getId());
        ps.setString(2, student.getName());
        ps.setString(3,student);
    }
}
