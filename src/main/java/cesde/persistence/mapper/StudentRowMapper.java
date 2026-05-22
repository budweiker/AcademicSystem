package cesde.persistence.mapper;

import cesde.domain.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setLastName(rs.getString("last_name"));
        student.setEmail(rs.getString("email"));
        student.setPhone(rs.getString("phone"));
        student.setPassword(rs.getString("passwd"));
        student.setStatus(rs.getString("status_student"));
        student.setStudentType(rs.getString("student_type"));
        return student;
    }
}
