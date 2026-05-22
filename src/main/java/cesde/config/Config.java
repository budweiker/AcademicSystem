package cesde.config;

import cesde.persistence.db.DataBaseConnection;
import cesde.persistence.mapper.StudentRowMapper;
import cesde.persistence.repository.StudentRepository;
import cesde.persistence.repository.StudentRepositoryDB;
import cesde.service.StudentServiceImpl;
import cesde.service.portoutput.StudentPersistencePort;
import cesde.userinterface.MenuApp;
import cesde.view.StudentView;

import java.sql.Connection;

public class Config {

    public static MenuApp createMenuApp() {


        StudentRepository studentRepositoryArray = new StudentRepository();
        Connection connection = DataBaseConnection.getInstance().getConnection();
        StudentRowMapper studentRowMapper = new StudentRowMapper();
        StudentPersistencePort studentRepositoryDB = new StudentRepositoryDB(connection, studentRowMapper);;
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl(studentRepositoryDB);
        StudentView studentView = new StudentView(studentServiceImpl);

        return new MenuApp(studentView);
    }


}
