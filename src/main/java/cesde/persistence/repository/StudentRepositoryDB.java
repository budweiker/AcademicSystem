package cesde.persistence.repository;

import cesde.domain.Student;
import cesde.persistence.mapper.RowMapper;
import cesde.persistence.mapper.StudentRowMapper;
import cesde.service.portoutput.StudentPersistencePort;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentRepositoryDB implements StudentPersistencePort {

    private final Connection connection;
    private final RowMapper rowMapper;

    public StudentRepositoryDB(Connection connection, RowMapper rowMapper) {
        this.connection = connection;
        this.rowMapper = rowMapper;
    }


    @Override
    public Student createStudentRepository(Student student) {

        String sql = "INSERT INTO student (id, name, last_name, email, phone, passwd, status, student_type) VALUES (?,?,?,?,?,?,?,?)";
        try(PreparedStatement ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){

            setCustomParams(ps, student);
            ps.executeUpdate();

            ResultSet keys = ps.getGeneratedKeys();
            if(keys.next()){
                student.setId(keys.getInt(1));
            }

        }catch (SQLException e){
            throw new RuntimeException("Error al insertar datos de estudiante", e);
        }
        return student;
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
    private void setCustomParams(PreparedStatement ps, Student student) throws SQLException{

        ps.setInt(1, student.getId());
        ps.setString(2, student.getName());
        ps.setString(3, student.getLastName());
        ps.setString(4, student.getEmail());
        ps.setString(5, student.getPhone());
        ps.setString(6, student.getPassword());
        ps.setString(7, student.getStatus());
        ps.setString(8, student.getStudentType()
        );

    }


}
