package cesde.config;

import cesde.domain.Student;
import cesde.repository.StudentRepository;
import cesde.service.StudentServiceImpl;
import cesde.userinterface.MenuApp;
import cesde.view.StudentView;

public class Config {

    public static MenuApp createMenuApp() {


        StudentRepository studentRepository = new StudentRepository();
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl( studentRepository);
        StudentView studentView = new StudentView(studentServiceImpl);

        return new MenuApp(studentView);
    }


}
